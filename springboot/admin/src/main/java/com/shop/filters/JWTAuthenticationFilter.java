/**
 * @author Mai Thành Duy An [tiachop0102@gmail.com]
 * 
 * https://github.com/maithanhduyan/universal-platforms
 */
package com.shop.filters;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.shop.services.TokenAuthenticationService;

public class JWTAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

    private Logger log = LoggerFactory.getLogger(getClass());

    private AuthenticationManager authenticationManager;

    public JWTAuthenticationFilter(AuthenticationManager authenticationManager) {
	this.authenticationManager = authenticationManager;
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
	    throws AuthenticationException {
	try {
	    
	    User creds = new ObjectMapper().readValue(request.getInputStream(), User.class);

	    return authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(creds.getUsername(),
		    creds.getPassword(), new ArrayList<>()));
	} catch (IOException e) {
	    throw new RuntimeException(e);
	}
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response,
	    FilterChain filterChain, Authentication auth) throws IOException, ServletException {
	// Write Authorization to Headers of Response.
	TokenAuthenticationService.addAuthentication(response, auth.getName());

	String authorizationString = response.getHeader("Authorization");
	log.info("TOKEN:" + authorizationString);
    }
}
