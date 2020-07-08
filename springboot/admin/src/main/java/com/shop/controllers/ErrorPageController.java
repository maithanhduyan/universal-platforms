/**
 * @author Mai Thành Duy An [tiachop0102@gmail.com]
 * 
 * https://github.com/maithanhduyan/universal-platforms
 */
package com.shop.controllers;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorPageController implements ErrorController {

    @GetMapping("/error")
    public String handleError(HttpServletRequest request) {
	Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
	String _errorPage = "";
	if (status != null) {
	    Integer statusCode = Integer.valueOf(status.toString());
	    switch (statusCode) {
	    case 401:
		_errorPage = "redirect:/401.html";
		break;
	    case 403:
		_errorPage = "redirect:/403.html";
		break;
	    case 404:
		_errorPage = "redirect:/404.html";
		break;
	    case 405:
		_errorPage = "redirect:/405.html";
		break;
	    case 500:
		_errorPage = "redirect:/500.html";
		break;
	    default:
		_errorPage = "errors/error";
		break;
	    }
	}
	return _errorPage;
    }

    @Override
    public String getErrorPath() {
	// TODO Auto-generated method stub
	return null;
    }

    @GetMapping(value = "/401.html")
    public String throw401Page() {
	return "errors/401";
    }

    @GetMapping(value = "/403.html")
    public String throw403Page() {
	return "errors/403";
    }

    @GetMapping(value = "/404.html")
    public String throw404Page() {
	return "errors/404";
    }

    @GetMapping(value = "/500.html")
    public String throw500Page() {
	return "errors/500";
    }

}
