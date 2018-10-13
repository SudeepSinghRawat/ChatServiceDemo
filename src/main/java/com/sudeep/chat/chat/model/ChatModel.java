package com.sudeep.chat.chat.model;

import java.util.Date;

public class ChatModel {
	private int id;
	private String userName;
	private String text;
	private Date date;
	private int timeout;
	
	 
	
	public ChatModel() {
		super();
	}

	public ChatModel(int id, String userName, String text, Date date) {
		super();
		this.id = id;
		this.userName = userName;
		this.text = text;
		this.date = date;
	}

	public ChatModel(int id, String userName, String text, Date date, int timeout) {
		super();
		this.id = id;
		this.userName = userName;
		this.text = text;
		this.date = date;
		this.timeout = timeout;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getTimeout() {
		return timeout;
	}

	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}

	@Override
	public String toString() {
		return "ChatModel [id=" + id + ", userName=" + userName + ", text=" + text + ", date=" + date + ", timeout="
				+ timeout + "]";
	}
	
	
	
	
	
	
	
}
