/**
 * @author Mai Thành Duy An [tiachop0102@gmail.com]
 * 
 * https://github.com/maithanhduyan/universal-platforms
 */
package com.shop.core.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.core.entities.Company;
import com.shop.core.repositories.CompanyRepository;
import com.shop.core.services.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public List<Company> getAll() {
	return companyRepository.findAll();
    }

    @Override
    public Company fetchById(String id) {
	return companyRepository.getOne(id);
    }

    @Override
    public Company getFirst() {
	return companyRepository.getFirst();
    }

}
