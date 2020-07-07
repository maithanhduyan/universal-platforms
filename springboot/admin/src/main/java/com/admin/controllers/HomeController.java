/**
 * @author Mai Thành Duy An [tiachop0102@gmail.com]
 * 
 * https://github.com/maithanhduyan/universal-platforms
 */
package com.admin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

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
