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

import com.shop.core.entities.OrderDetail;
import com.shop.core.services.OrderDetailService;

@SpringBootTest
public class OrderDetailServiceTest {

    @Autowired
    OrderDetailService orderDetailService;

    @Test
    void getAll() {
	List<OrderDetail> list = orderDetailService.getAll();
	System.out.println("OrderDetail List: " + list.size());
	assertTrue(list.size() >= 0);
    }
}
