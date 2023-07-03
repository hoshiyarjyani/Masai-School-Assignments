package com.masai.shayari.controller;

public record GenerationRequest(String prompt, int n, 
		String size, String response_format) {
	
	public static GenerationRequest defaultWith(String prompt) {
		return new GenerationRequest(prompt, 1, "1024x1024", "url");
	}
	
}