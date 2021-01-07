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
@RequestMapping(value = "/customer/")
public class CustomerController {

    @GetMapping(value = "/index.html")
    public String viewCustomerListPage() {
	return "views/customers/index";
    }

    @GetMapping(value = "/group.html")
    public String viewCustomerGroupPage() {
	return "views/customers/group";
    }

    @GetMapping(value = "/report.html")
    public String viewCustomerReportPage() {
	return "views/customers/report";
    }
}
