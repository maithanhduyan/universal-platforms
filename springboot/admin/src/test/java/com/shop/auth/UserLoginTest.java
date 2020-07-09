/**
 * @author Mai Thành Duy An [tiachop0102@gmail.com]
 * 
 * https://github.com/maithanhduyan/universal-platforms
 */
package com.shop.auth;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.core.entities.User;
import com.shop.core.services.UserService;

@SpringBootTest
public class UserLoginTest {

    private Logger log = LoggerFactory.getLogger(getClass());
    
    @Autowired
    UserService userService;

    @Test
    void findByUsername() {
	String _username = "admin@pos.com";
	User user = userService.findByUsername("admin@pos.com");
	log.info(user.getUsername());
	assertTrue(user.getUsername().equals(_username));
    }
}
