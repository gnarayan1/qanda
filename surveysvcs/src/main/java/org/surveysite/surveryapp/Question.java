package org.surveysite.surveryapp;

import org.springframework.data.annotation.Id;

public class Question {

	@Id private String id;

	private String text;


	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
