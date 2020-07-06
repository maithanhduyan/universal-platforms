/**
 * @author Mai Thành Duy An [tiachop0102@gmail.com]
 * 
 * https://github.com/maithanhduyan/universal-platforms
 */
package com.admin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {

    @RequestMapping(value = "/customer-list")
    public String viewCustomerListPage() {
	return "customers/list";
    }

    @RequestMapping(value = "/customer-group")
    public String viewCustomerGroupPage() {
	return "customers/group";
    }

    @RequestMapping(value = "/customer-report")
    public String viewCustomerReportPage() {
	return "customers/report";
    }
}
