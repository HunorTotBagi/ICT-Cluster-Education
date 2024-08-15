package com.iktpreobuka.email_example.models;

public class EmailObject {

	protected String to;
	protected String subject;
	protected String text;
	
	public EmailObject() {
	}
	
	public EmailObject(String to, String subject, String text) {
		this.to = to;
		this.subject = subject;
		this.text = text;
	}

	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	
}
