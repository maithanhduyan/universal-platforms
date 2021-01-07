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
@RequestMapping(value = "/dashboard")
public class DashboardController {

    @GetMapping(value = "/index.html")
    public String viewHomePage() {
	return "views/dashboard/index";
    }
    
    @GetMapping(value = "/todo.html")
    public String viewTodoPage() {
	return "views/dashboard/todo";
    }
    
    @GetMapping(value = "/report.html")
    public String viewReportPage() {
	return "views/dashboard/report";
    }
}
