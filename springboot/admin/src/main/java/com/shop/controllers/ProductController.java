/**
 * @author Mai Thành Duy An [tiachop0102@gmail.com]
 * 
 * https://github.com/maithanhduyan/universal-platforms
 */
package com.shop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/product")
public class ProductController {

    @GetMapping(value = "/index.html")
    public String viewListPage() {
	return "views/products/index";
    }
    
    @GetMapping(value = "/category.html")
    public String viewCategoryPage() {
	return "views/products/category";
    }
    
    @GetMapping(value = "/add.html")
    public String viewAddNewPage() {
	return "views/products/add";
    }
}
