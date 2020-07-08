/**
 * @author Mai Thành Duy An [tiachop0102@gmail.com]
 * 
 * https://github.com/maithanhduyan/universal-platforms
 */
package com.shop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @GetMapping(value = "/")
    public String viewHomePage() {
	return "views/auth/login";
    }
    
 // using jsp page
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String viewHomeJspPage() {
        return "views/index";
    }
}
