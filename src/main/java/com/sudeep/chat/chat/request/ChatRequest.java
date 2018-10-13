package com.sudeep.chat.chat.request;

public class ChatRequest {
	private String userName;
	private String text;
	private int timeout;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getTimeout() {
		return timeout;
	}
	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}
	@Override
	public String toString() {
		return "ChatRequest [userName=" + userName + ", text=" + text + ", timeout=" + timeout + "]";
	}
	
	
	
	
	
	
	

}
