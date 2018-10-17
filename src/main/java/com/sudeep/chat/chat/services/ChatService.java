package com.sudeep.chat.chat.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sudeep.chat.chat.model.ChatModel;
import com.sudeep.chat.chat.reponse.AllChat;
import com.sudeep.chat.chat.request.ChatRequest;
import com.sudeep.chat.chat.util.ChatUtil;

@Service
public class ChatService {
	private static List<ChatModel> notExpireMessage =  new ArrayList<>(Arrays.asList(
			new ChatModel[] {
					new ChatModel(1, "Bob", "This is first default Message", Calendar.getInstance().getTime()),
					new ChatModel(2, "Marsh", "This is first default Message of march", Calendar.getInstance().getTime()),
					new ChatModel(3, "Bob", "This is secound undeleted Message of Bob", Calendar.getInstance().getTime())
			}));
	
	private static List<ChatModel> expireMessage =  new ArrayList<>(Arrays.asList(
			new ChatModel[] {
					new ChatModel(1000, "Bob", "This is first expire  default Message", Calendar.getInstance().getTime()),
					new ChatModel(1002, "Marsh", "This is first default Message of march", Calendar.getInstance().getTime()),
					new ChatModel(1003, "Bob", "This is secound undeleted Message of Bob", Calendar.getInstance().getTime())
			}));
	
	 public ChatModel getChat(int id) {
		 
		 ChatModel chatModel = null;
		
		if(id >= 1000) {
			for(ChatModel cM: expireMessage) {
				System.out.println(cM);
				if(cM.getId() == id) {
					
					chatModel = cM;
					break;
				}
			}
		}
		else {
			for(ChatModel cM: notExpireMessage) {
				System.out.println(cM);
				if(cM.getId() == id) {
					chatModel = cM;
					break;
				}
			}
		}
		System.out.println("im here");
		System.out.println(chatModel);
		return chatModel;
	}
	 
	 public List<AllChat> getAllChat(String name) {
		 List<AllChat> chatList = new LinkedList<>();
		 for(ChatModel cM: notExpireMessage ) {
			 if(cM.getUserName().equalsIgnoreCase(name)) {
				 AllChat newResponse = new AllChat(cM.getId(),cM.getText());
				 chatList.add(newResponse);
			 }
		 }
		 
		 
		 
		 return chatList;
	 }
	 
	 public int addChat(ChatRequest chat) {
		 int id = expireMessage.get(expireMessage.size()-1).getId()+1;
		 //int id = (expireMessage.size()+1;
		 ChatModel newChat  = new ChatModel();
		 newChat.setId(id);
		 newChat.setText(chat.getText());
		 newChat.setUserName(chat.getUserName());
		 newChat.setDate(ChatUtil.getTime(chat.getTimeout()));
		 expireMessage.add(newChat);
		 System.out.println(newChat);
		 System.out.println(expireMessage);
		 return id;
	 }

}
