package com.sudeep.chat.chat.reponse;

public class AllChat {
	private int id;
	private String  text;
	public AllChat(int id, String text) {
		super();
		this.id = id;
		this.text = text;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	@Override
	public String toString() {
		return "AllChat [id=" + id + ", text=" + text + "]";
	}
	
	

}
