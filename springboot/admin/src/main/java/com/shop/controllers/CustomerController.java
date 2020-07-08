/**
 * @author Mai Thành Duy An [tiachop0102@gmail.com]
 * 
 * https://github.com/maithanhduyan/universal-platforms
 */
package com.shop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {

    @GetMapping(value = "/admin.customer.list.html")
    public String viewCustomerListPage() {
	return "customers/list";
    }

    @GetMapping(value = "/admin.customer.group.html")
    public String viewCustomerGroupPage() {
	return "customers/group";
    }

    @GetMapping(value = "/admin.customer.report.html")
    public String viewCustomerReportPage() {
	return "customers/report";
    }
}
