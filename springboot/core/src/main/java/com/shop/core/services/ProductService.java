package com.shop.core.services;

import java.util.List;

import org.springframework.stereotype.Service;


@Service
public interface ProductService {
    public List<com.shop.core.entities.Product> getAll();
}
