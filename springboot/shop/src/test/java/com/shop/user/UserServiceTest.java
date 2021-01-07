/**
 * @author Mai Thành Duy An [tiachop0102@gmail.com]
 * 
 * https://github.com/maithanhduyan/universal-platforms
 */
package com.shop.user;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.core.entities.User;
import com.shop.core.services.UserService;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    UserService userService;

    @Test
    void getAll() {
	List<User> list = userService.getAll();
	System.out.println("User List:" + list.size());
	assertTrue(list.size() >= 0);
    }
}
