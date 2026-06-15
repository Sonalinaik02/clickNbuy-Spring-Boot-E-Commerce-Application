package com.jsp.shopping.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.shopping.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
    
    // Find by username
    Optional<Admin> findByUsername(String username);
    
    // Check if username exists
    boolean existsByUsername(String username);
}