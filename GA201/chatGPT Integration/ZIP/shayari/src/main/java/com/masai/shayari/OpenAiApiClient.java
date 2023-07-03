package com.masai.shayari;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

@Component
public class OpenAiApiClient {

	public enum OpenAiService {
		DALL_E, GPT_3;
	}

	@Value("${openai.api_key}")
	private String openaiApiKey;

	private final HttpClient client = HttpClient.newHttpClient();

	public String postToOpenAiApi(String requestBodyAsJson, OpenAiService service)
			throws IOException, InterruptedException {
		var request = HttpRequest.newBuilder().uri(selectUri(service))
				.header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
				.header(HttpHeaders.AUTHORIZATION, "Bearer " + openaiApiKey)
				.POST(BodyPublishers.ofString(requestBodyAsJson)).build();
		return client.send(request, HttpResponse.BodyHandlers.ofString()).body();
	}

	private URI selectUri(OpenAiService service) {
		return URI.create(switch (service) {
		case DALL_E -> "https://api.openai.com/v1/images/generations";
		case GPT_3 -> "https://api.openai.com/v1/completions";
		});
	}

}