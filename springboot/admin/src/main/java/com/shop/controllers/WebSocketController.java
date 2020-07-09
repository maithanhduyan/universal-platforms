/**
 * @author Mai Thành Duy An [tiachop0102@gmail.com]
 * 
 * https://github.com/maithanhduyan/universal-platforms
 */
package com.shop.controllers;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import com.shop.models.ChatMessageModel;

@Controller
public class WebSocketController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @MessageMapping("/chat.sendMessage")
    @SendTo("/topic/publicChatRoom")
    public ChatMessageModel sendMessage(@Payload ChatMessageModel chatMessage , @RequestParam Map<String, String> data) {
	log.info(chatMessage.toString());
//	log.info(data.toString());
	return chatMessage;
    }

    @MessageMapping("/chat.addUser")
    @SendTo("/topic/publicChatRoom")
    public ChatMessageModel addUser(@Payload ChatMessageModel chatMessage, SimpMessageHeaderAccessor headerAccessor) {
	// Add username in web socket session
	headerAccessor.getSessionAttributes().put("username", chatMessage.getSender());
	return chatMessage;
    }

}
