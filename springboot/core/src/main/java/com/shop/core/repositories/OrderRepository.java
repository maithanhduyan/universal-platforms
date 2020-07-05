/**
 * @author Mai Thành Duy An [tiachop0102@gmail.com]
 * 
 * https://github.com/maithanhduyan/universal-platforms
 */
package com.shop.core.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.shop.core.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, String> {

    @Query("SELECT ord FROM Order ord WHERE ord.active = 1")
    public List<Order> getAll();
}
