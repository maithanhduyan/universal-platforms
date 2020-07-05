/**
 * @author Mai Thành Duy An [tiachop0102@gmail.com]
 * 
 * https://github.com/maithanhduyan/universal-platforms
 */
package com.shop.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.shop.core.entities.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, String> {

    @Query("SELECT c FROM Company c WHERE c.active = 1")
    public Company getFirst();
}
