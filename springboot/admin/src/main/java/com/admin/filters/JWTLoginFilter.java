/**
 * @author Mai Thành Duy An [tiachop0102@gmail.com]
 * 
 * https://github.com/maithanhduyan/universal-platforms
 */
package com.admin.filters;

import java.io.IOException;
import java.util.Collections;

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
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.admin.services.TokenAuthenticationService;

public class JWTLoginFilter extends AbstractAuthenticationProcessingFilter {

    private Logger log = LoggerFactory.getLogger(this.getClass().getName());

    public JWTLoginFilter(String url, AuthenticationManager authManager) {
	super(new AntPathRequestMatcher(url));
	setAuthenticationManager(authManager);
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
	    throws AuthenticationException, IOException, ServletException {

	String username = request.getParameter("username");
	String password = request.getParameter("password");

	log.info("JWTLoginFilter.attemptAuthentication: username/password= %s,%s", username, password);

	return getAuthenticationManager()
		.authenticate(new UsernamePasswordAuthenticationToken(username, password, Collections.emptyList()));
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
	    Authentication authResult) throws IOException, ServletException {

	log.info("JWTLoginFilter.successfulAuthentication:");

	// Write Authorization to Headers of Response.
	TokenAuthenticationService.addAuthentication(response, authResult.getName());

	String authorizationString = response.getHeader("Authorization");

	log.info("Authorization String=" + authorizationString);
    }

}
