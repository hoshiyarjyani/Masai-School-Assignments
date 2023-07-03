package com.masai.shayari.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.masai.shayari.FormInputDTO;
import com.masai.shayari.OpenAiApiClient;
import com.masai.shayari.OpenAiApiClient.OpenAiService;



@Controller
public class ChatGptController {
	
	private static final String MAIN_PAGE = "index";
	
	@Autowired private ObjectMapper jsonMapper;
	@Autowired private OpenAiApiClient client;
	
	private String chatWithGpt3(String message) throws Exception {
		var completion = CompletionRequest.defaultWith(message);
		var postBodyJson = jsonMapper.writeValueAsString(completion);
		var responseBody = client.postToOpenAiApi(postBodyJson, OpenAiService.GPT_3);
		var completionResponse = jsonMapper.readValue(responseBody, CompletionResponse.class);
		return completionResponse.firstAnswer().orElseThrow();
	}
	
	@GetMapping(path = "/")
	public String index() {
		return MAIN_PAGE;
	}
	
	@PostMapping(path = "/")
	public String chat(Model model, @ModelAttribute FormInputDTO dto) {
		try {
			model.addAttribute("request", dto.prompt());
			model.addAttribute("response", chatWithGpt3(dto.prompt()));
		} catch (Exception e) {
			model.addAttribute("response", "Error in communication with OpenAI ChatGPT API.");
		}
		return MAIN_PAGE;
	}
	
}