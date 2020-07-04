/**
 * @author Mai Thành Duy An [tiachop0102@gmail.com]
 * 
 * https://github.com/maithanhduyan/universal-platforms
 */
package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String viewHomePage(Model model) {
        model.addAttribute("title", "Welcome");
        model.addAttribute("message", "This is welcome page!");
        return "thymeleaf/index";
    }

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String viewAboutPage(Model model) {
        model.addAttribute("title", "Welcome");
        model.addAttribute("message", "This is welcome page!");
        return "thymeleaf/about";
    }

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public String viewContactPage(Model model) {
        model.addAttribute("title", "Welcome");
        model.addAttribute("message", "This is welcome page!");
        return "thymeleaf/contact";
    }

    @RequestMapping(value = "/services", method = RequestMethod.GET)
    public String viewServicesPage(Model model) {
        model.addAttribute("title", "Welcome");
        model.addAttribute("message", "This is welcome page!");
        return "thymeleaf/services";
    }

    // using jsp page
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String viewHomeJspPage() {
        return "views/index";
    }
}
