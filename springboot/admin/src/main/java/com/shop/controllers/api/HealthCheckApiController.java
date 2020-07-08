/**
 * @author Mai Thành Duy An [tiachop0102@gmail.com]
 * 
 * https://github.com/maithanhduyan/universal-platforms
 */
package com.shop.controllers.api;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckApiController {

    @RequestMapping(value = "/healthCheck", method = RequestMethod.POST)
    public @ResponseBody Map<String, String> healthCheck() {
	Map<String, String> dataResponse = new HashMap<>();
	dataResponse.put("status", "OK");
	return dataResponse;
    }
}
