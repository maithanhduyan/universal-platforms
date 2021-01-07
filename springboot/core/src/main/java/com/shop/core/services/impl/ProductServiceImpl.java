package com.shop.core.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.shop.core.entities.Product;
import com.shop.core.repositories.ProductRepository;
import com.shop.core.services.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAll() {
	return productRepository.findAll();
    }

    @Override
    public Page<Product> findAll(Pageable pageable, String keyword) {
	return productRepository.findAll(pageable, keyword);
    }
}
