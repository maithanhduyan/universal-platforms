/**
 * @author Mai Thành Duy An [tiachop0102@gmail.com]
 * 
 */
package com.chess.interceptors;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.HandshakeInterceptor;

@Component
public class HttpHandshakeInterceptor implements HandshakeInterceptor {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Override
    public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler,
	    Map<String, Object> attributes) throws Exception {
	log.debug("Call beforeHandshake");
	if (request instanceof ServletServerHttpRequest) {
	    ServletServerHttpRequest servletRequest = (ServletServerHttpRequest) request;
	    HttpSession session = servletRequest.getServletRequest().getSession();
	    attributes.put("sessionId", session.getId());
	    log.debug("Call beforeHandshake" + session.getId());
	}
	return true;
    }

    @Override
    public void afterHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler,
	    Exception exception) {
	log.debug("Call afterHandshake");

    }

}
