/**
 * @author Mai Thành Duy An [tiachop0102@gmail.com]
 * 
 */
package com.chess.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chess.models.ChatMessageModel;
import com.chess.models.ChessMessageModel;

@Controller
public class HomeController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/")
    public String viewHomePage() {
	return "/home";
    }
    
    @RequestMapping("/alpha")
    public String viewAlphaPage() {
	return "/alpha";
    }

    @MessageMapping("/chat.sendMessage")
    @SendTo("/topic/publicChatRoom")
    public ChatMessageModel sendMessage(@Payload ChatMessageModel chatMessage) {
	log.info("/topic/publicChatRoom: " + chatMessage.getContent());
	return chatMessage;
    }

    @MessageMapping("/chat.addUser")
    @SendTo("/topic/publicChatRoom")
    public ChatMessageModel addUser(@Payload ChatMessageModel chatMessage, SimpMessageHeaderAccessor headerAccessor) {
	// Add username in web socket session
	headerAccessor.getSessionAttributes().put("username", chatMessage.getSender());
	log.info("Add username: " + chatMessage.getSender());
	return chatMessage;
    }
    
    
    @MessageMapping("/chess.move")
    @SendTo("/chess/publicChessRoom")
    public ChessMessageModel moveMessage(@Payload ChessMessageModel chessMessageModel ) {
	log.info("Move: " + chessMessageModel.getContent());
	log.info("Computer move : " + "♟b7→b5");
	chessMessageModel.setContent("♟b7→b5");
	chessMessageModel.setPlayer("Computer");
	return chessMessageModel;
    }
    
    @MessageMapping("/chess.addPlayer")
    @SendTo("/chess/addPlayer")
    public ChessMessageModel addUser(@Payload ChessMessageModel chessMessage, SimpMessageHeaderAccessor headerAccessor) {
	headerAccessor.getSessionAttributes().put("player", chessMessage.getPlayer());
	return chessMessage;
    }
}
