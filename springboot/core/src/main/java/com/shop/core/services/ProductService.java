package com.shop.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shop.core.entities.Product;

@Service
public interface ProductService {
    public List<Product> getAll();
}
