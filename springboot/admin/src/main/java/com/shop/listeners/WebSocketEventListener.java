/**
 * @author Mai Thành Duy An [tiachop0102@gmail.com]
 * 
 * https://github.com/maithanhduyan/universal-platforms
 */
package com.shop.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionConnectedEvent;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

import com.shop.models.ChatMessageModel;

@Component
public class WebSocketEventListener {
    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SimpMessageSendingOperations messagingTemplate;
    
    @EventListener
    public void handleWebSocketConnectListener(SessionConnectedEvent event) {
        log.info("Received a new web socket connection");
    }
    
    @EventListener
    public void handleWebSocketDisconnectListener(SessionDisconnectEvent event) {
        StompHeaderAccessor headerAccessor = StompHeaderAccessor.wrap(event.getMessage());
 
        String username = (String) headerAccessor.getSessionAttributes().get("username");
         
        if(username != null) {
            log.info("User Disconnected : " + username);
 
            ChatMessageModel chatMessage = new ChatMessageModel();
            chatMessage.setType(ChatMessageModel.MessageType.LEAVE);
            chatMessage.setSender(username);
 
            messagingTemplate.convertAndSend("/topic/publicChatRoom", chatMessage);
        }
    }

}
