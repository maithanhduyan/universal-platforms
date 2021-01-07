/**
 * @author Mai Thành Duy An [tiachop0102@gmail.com]
 * 
 * https://github.com/maithanhduyan/universal-platforms
 */
package com.shop.product;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.core.entities.Product;
import com.shop.core.services.ProductService;

@SpringBootTest
public class ProductServiceTest {

    @Autowired
    ProductService productService;

    @Test
    void getAll() {
	List<Product> list = productService.getAll();
	assertTrue(list.size() >= 0);
	System.out.println("Product list: " + list.size());
    }
}
