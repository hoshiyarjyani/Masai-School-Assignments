package com.masai.shayari.controller;

import java.util.List;
import java.util.Optional;

public record GenerationResponse(List<ImageUrl> data) {
	
	public Optional<String> firstImageUrl() {
		if (data == null || data.isEmpty())
			return Optional.empty();
		return Optional.of(data.get(0).url);
	}
	
	record ImageUrl(String url) {}
	
}