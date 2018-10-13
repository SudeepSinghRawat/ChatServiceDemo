package com.sudeep.chat.chat.chatcontroller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sudeep.chat.chat.model.ChatModel;
import com.sudeep.chat.chat.reponse.AllChat;
import com.sudeep.chat.chat.request.ChatRequest;
import com.sudeep.chat.chat.services.ChatService;

@RestController
public class ChatController {
	@Autowired
	ChatService chatService;
	
	@RequestMapping(value="/chat/{id}" , method	 = RequestMethod.GET , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<ChatModel> getChat(
			@PathVariable("id") int id) {
		
		ChatModel chat = chatService.getChat(id);
		
		return new ResponseEntity<ChatModel>(chat,HttpStatus.OK);
	}
	@RequestMapping(value="/chats/{username}" , method = RequestMethod.GET , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<List<AllChat>> getallChat(
			@PathVariable("username") String userName ) {
		
		List<AllChat> allMessage = chatService.getAllChat(userName);
		
		return new ResponseEntity<List<AllChat>>(allMessage, HttpStatus.OK);
		
	}
	
	@RequestMapping(value="" , method =RequestMethod.POST , produces = MediaType.APPLICATION_JSON_UTF8_VALUE , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Map<String,Integer>> saveSave(@RequestBody ChatRequest newChat) {
		int i  = chatService.addChat(newChat);
		Map<String, Integer> myRespose = new HashMap<>();
		myRespose.put("id", i);
		return new ResponseEntity<Map<String,Integer>>(myRespose, HttpStatus.OK);
		//return new ResponseEntity<Integer>(i, HttpStatus.OK);
	}

}
