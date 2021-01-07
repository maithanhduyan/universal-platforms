/**
 * @author Mai Thành Duy An [tiachop0102@gmail.com]
 * 
 * https://github.com/maithanhduyan/universal-platforms
 */
package com.shop.controllers.api;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shop.core.entities.Product;
import com.shop.core.services.ProductService;
import com.shop.utils.datatable.DatatableRequest;
import com.shop.utils.datatable.DatatableResponse;

@RestController
@RequestMapping(value = "/api/product")
public class ProductApiController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    ProductService productService;

    @Autowired
    private DatatableRequest datatableRequest;

    @Autowired
    private DatatableResponse datatableResponse;

    @RequestMapping(value = "/findAll", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Map<String, Object> findAll(@RequestParam Map<String, String> data) {
	datatableRequest.setDataRequest(data);

	Page<Product> _pageData = productService
		.findAll(
			PageRequest.of(datatableRequest.getPage(), datatableRequest.getSize(),
				datatableRequest.getDirection(), datatableRequest.getColumn()),
			datatableRequest.getSearch());
	long recordsTotal = _pageData.getTotalElements();
	datatableResponse.setDraw(datatableRequest.getDraw());
	datatableResponse.setRecordsTotal(recordsTotal);
	datatableResponse.setRecordsFiltered(recordsTotal);
	datatableResponse.setContent(_pageData.getContent());
	return datatableResponse.data();
    }
}