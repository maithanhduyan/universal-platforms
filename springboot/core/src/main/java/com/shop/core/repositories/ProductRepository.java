/**
 * @author Mai Thành Duy An [tiachop0102@gmail.com]
 * 
 * https://github.com/maithanhduyan/universal-platforms
 */
package com.shop.core.repositories;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.shop.core.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {
    
    @Query("SELECT p FROM Product p WHERE p.active =1")
    public List<Product> findAll();
    
    @Cacheable(cacheNames = "products")
    @Query("SELECT p FROM Product p WHERE p.active =1 AND p.name LIKE %:keyword% OR p.code LIKE %:keyword% OR p.category.name LIKE %:keyword% ")
    public Page<Product> findAll(Pageable pageable, @Param("keyword") String keyword);
}
