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

import com.shop.core.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, String> {

    @Query("SELECT r FROM Role r WHERE r.active = 1")
    public List<Role> getAll();
}
