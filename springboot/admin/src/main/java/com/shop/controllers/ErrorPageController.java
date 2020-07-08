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
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorPageController implements ErrorController {

    @GetMapping("/error")
    public String handleError(HttpServletRequest request, Model model) {
	Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
	String _errorPage = "";
	if (status != null) {
	    Integer statusCode = Integer.valueOf(status.toString());
	    switch (statusCode) {
	    case 401:
		_errorPage = "views/errors/401";
		break;
	    case 403:
		_errorPage = "views/errors/403";
		break;
	    case 404:
		_errorPage = "views/errors/404";
		break;
	    case 405:
		_errorPage = "views/errors/405";
		break;
	    case 500:
		_errorPage = "views/errors/500";
		break;
	    default:
		_errorPage = "views/errors/error";
		break;
	    }
	}
	model.addAttribute("message", status);
//	return _errorPage;
	return "views/errors/error";
    }

    @Override
    public String getErrorPath() {
	// TODO Auto-generated method stub
	return null;
    }

    @GetMapping(value = "/401.html")
    public String throw401Page() {
	return "views/errors/401";
    }

    @GetMapping(value = "/403.html")
    public String throw403Page() {
	return "views/errors/403";
    }

    @GetMapping(value = "/404.html")
    public String throw404Page() {
	return "views/errors/404";
    }

    @GetMapping(value = "/500.html")
    public String throw500Page() {
	return "views/errors/500";
    }

}
