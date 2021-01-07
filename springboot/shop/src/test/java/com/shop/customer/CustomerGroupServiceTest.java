/**
 * @author Mai Thành Duy An [tiachop0102@gmail.com]
 * 
 * https://github.com/maithanhduyan/universal-platforms
 */
package com.shop.customer;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.core.entities.CustomerGroup;
import com.shop.core.services.CustomerGroupService;

@SpringBootTest
public class CustomerGroupServiceTest {

    @Autowired
    CustomerGroupService customerGroupService;

    @Test
    void getAll() {
	List<CustomerGroup> list = customerGroupService.getAll();
	System.out.println("Customer Group List:" + list.size());
	assertTrue(list.size() >= 0);
    }
}
