package com.crimsonlogic.inventorymanagementsystem.repository;

import com.crimsonlogic.inventorymanagementsystem.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAdminRepository extends JpaRepository<Admin, Long> {
    
}

