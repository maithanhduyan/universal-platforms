/**
 * @author Mai Thành Duy An [tiachop0102@gmail.com]
 * 
 * https://github.com/maithanhduyan/universal-platforms
 */
package com.shop.role;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.core.entities.Role;
import com.shop.core.services.RoleService;

@SpringBootTest
public class RoleSerivceTest {

    @Autowired
    RoleService roleService;

    @Test
    void getAll() {
	List<Role> list = roleService.getAll();
	System.out.println("Role List:" + list.size());
	assertTrue(list.size() >= 0);
    }
}
