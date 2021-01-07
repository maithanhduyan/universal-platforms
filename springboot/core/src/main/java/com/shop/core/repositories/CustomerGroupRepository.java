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

import com.shop.core.entities.CustomerGroup;

@Repository
public interface CustomerGroupRepository extends JpaRepository<CustomerGroup, String> {

    @Query("SELECT cg FROM CustomerGroup cg WHERE cg.active = 1")
    public List<CustomerGroup> getAll();
}
