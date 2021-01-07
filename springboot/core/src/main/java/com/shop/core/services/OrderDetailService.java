/**
 * @author Mai Thành Duy An [tiachop0102@gmail.com]
 * 
 * https://github.com/maithanhduyan/universal-platforms
 */
package com.shop.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shop.core.entities.OrderDetail;

@Service
public interface OrderDetailService {

    public List<OrderDetail> getAll();
    
}
