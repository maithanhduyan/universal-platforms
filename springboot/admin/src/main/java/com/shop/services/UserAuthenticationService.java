/**
 * @author Mai Thành Duy An [tiachop0102@gmail.com]
 * 
 * https://github.com/maithanhduyan/universal-platforms
 */
package com.shop.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.shop.core.entities.User;
import com.shop.core.services.UserService;

@Service
public class UserAuthenticationService implements UserDetailsService {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	try {
	    User user = userService.findByUsername(username);
	    UserDetails userDetails = org.springframework.security.core.userdetails.User
		    .withUsername(user.getUsername())//
		    .password(user.getPassword())//
		    .roles(user.getRole().getName()).build();
	    log.info("Username:" + userDetails.getUsername() + "/Password:" + userDetails.getPassword()+ "/Role:" + user.getRole().getName());
	    return userDetails;
	} catch (Exception ex) {
	    log.error(ex.getMessage());
	}

	return null;
    }

}
