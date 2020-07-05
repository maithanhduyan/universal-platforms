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

import com.shop.core.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{

    @Query("SELECT u FROM User u WHERE u.active = 1 ")
    public List<User> getAll();
}
