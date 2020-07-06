/**
 * @author Mai Thành Duy An [tiachop0102@gmail.com]
 * 
 * https://github.com/maithanhduyan/universal-platforms
 */
package com.admin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {


    @RequestMapping(value = "/login")
    public String viewLoginPage() {
	return "login";
    }

    @RequestMapping(value = "/")
    public String viewDashBoardPage(Model model) {
	model.addAttribute("company", "SHOPPING MALL");
	return "index";
    }

}
