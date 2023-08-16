package com.crimsonlogic.inventorymanagementsystem.service;

import com.crimsonlogic.inventorymanagementsystem.entity.Admin;
import com.crimsonlogic.inventorymanagementsystem.repository.IAdminRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AdminServiceImpl implements IAdminService {

    private final IAdminRepository adminRepository;

    @Autowired
    public AdminServiceImpl(IAdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @Override
    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

    @Override
    @Transactional
    public void saveAdmin(Admin admin) {
        adminRepository.save(admin);
    }
}

