/**
 * @author Mai Thành Duy An [tiachop0102@gmail.com]
 * 
 * https://github.com/maithanhduyan/universal-platforms
 */
package com.shop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.shop.core.services.ProductService;

@Controller
public class HomeController {

    @Autowired
    ProductService productService;

    @GetMapping(value = { "/admin.insight.html" })
    public String viewDashBoardPage(Model model) {
	model.addAttribute("company", "SHOPPING MALL");
	return "index";
    }

    @GetMapping(value = "/")
    public String viewHomePage() {
	return "auth/login";
    }
}
