package com.sudeep.chat.chat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sudeep.chat.chat.model.ChatModel;
import com.sudeep.chat.chat.reponse.AllChat;
import com.sudeep.chat.chat.services.ChatService;
import com.sudeep.chat.chat.util.ChatUtil;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ChatApplicationTests {
	
	@Autowired
	ChatService chatService;
	
	@Test
	public void contextLoads() {
		
		ChatModel cm = chatService.getChat(1);
		System.out.println(cm);
		
		List<AllChat> cm1 = chatService.getAllChat("Bob");
		System.out.println(cm1);
		
		System.out.println(ChatUtil.getTime(30000));
	}

}
