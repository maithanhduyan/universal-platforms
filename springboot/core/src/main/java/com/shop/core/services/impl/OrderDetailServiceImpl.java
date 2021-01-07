/**
 * @author Mai Thành Duy An [tiachop0102@gmail.com]
 * 
 * https://github.com/maithanhduyan/universal-platforms
 */
package com.shop.core.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.core.entities.OrderDetail;
import com.shop.core.repositories.OrderDetailRepository;
import com.shop.core.services.OrderDetailService;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {

    @Autowired
    OrderDetailRepository orderDetailRepository;

    @Override
    public List<OrderDetail> getAll() {
	return orderDetailRepository.getAll();
    }

}
