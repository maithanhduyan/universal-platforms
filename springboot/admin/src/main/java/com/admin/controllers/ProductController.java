/**
 * @author Mai Thành Duy An [tiachop0102@gmail.com]
 * 
 * https://github.com/maithanhduyan/universal-platforms
 */
package com.admin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductController {

    @RequestMapping(value = "/product-list", method = RequestMethod.GET)
    public String viewProductListPage() {
	return "products/list";
    }
    
    @RequestMapping(value = "/product-category", method = RequestMethod.GET)
    public String viewProductCategoryPage() {
	return "products/category";
    }
    
    @RequestMapping(value = "/product-addnew", method = RequestMethod.GET)
    public String viewProductAddNewPage() {
	return "products/addnew";
    }
}
