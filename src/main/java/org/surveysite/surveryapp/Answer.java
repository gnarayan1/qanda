package org.surveysite.surveryapp;

import org.springframework.data.annotation.Id;

public class Answer {
	
	@Id private String id;
	
	private String comment;
	private int value;
	private String questionId;
	
	
	public String getQuestionId() {
		return questionId;
	}
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
		
	

}
