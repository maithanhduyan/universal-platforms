package com.shop.core.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.shop.core.entities.Product;

@Service
public interface ProductService {

    public List<Product> getAll();

    public Page<Product> findAll(Pageable pageable, String keyword);
}
