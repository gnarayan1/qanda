package org.surveysite.surveryapp;

import org.springframework.data.annotation.Id;

public class Answer {
	
	@Id private String id;
	
	private String comment;
	private int rating;
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
	public int getRating() {
		return rating;
	}
	public void setTating(int rating) {
		this.rating = rating;
	}
	
		
	

}
