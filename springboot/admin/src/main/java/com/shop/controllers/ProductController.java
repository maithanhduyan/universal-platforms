/**
 * @author Mai Thành Duy An [tiachop0102@gmail.com]
 * 
 * https://github.com/maithanhduyan/universal-platforms
 */
package com.shop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    @GetMapping(value = "/admin.product.list.html")
    public String viewProductListPage() {
	return "products/list";
    }
    
    @GetMapping(value = "/admin.product.category.html")
    public String viewProductCategoryPage() {
	return "products/category";
    }
    
    @GetMapping(value = "/admin.product.addnew.html")
    public String viewProductAddNewPage() {
	return "products/addnew";
    }
}
