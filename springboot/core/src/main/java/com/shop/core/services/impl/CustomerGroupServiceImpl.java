/**
 * @author Mai Thành Duy An [tiachop0102@gmail.com]
 * 
 * https://github.com/maithanhduyan/universal-platforms
 */
package com.shop.core.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.core.entities.CustomerGroup;
import com.shop.core.repositories.CustomerGroupRepository;
import com.shop.core.services.CustomerGroupService;

@Service
public class CustomerGroupServiceImpl implements CustomerGroupService {

    @Autowired
    CustomerGroupRepository customerGroupRepository;

    @Override
    public List<CustomerGroup> getAll() {
	return customerGroupRepository.getAll();
    }

}
