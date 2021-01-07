/**
 * @author Mai Thành Duy An [tiachop0102@gmail.com]
 * 
 * https://github.com/maithanhduyan/universal-platforms
 */
package com.shop.order;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.core.entities.Order;
import com.shop.core.services.OrderService;

@SpringBootTest
public class OrderServiceTest {

    @Autowired
    OrderService orderService;

    @Test
    void getAll() {
	List<Order> list = orderService.getAll();
	int size = list.size();
	System.out.println("Order List: " + size);
	assertTrue(size >= 0);
    }
}
