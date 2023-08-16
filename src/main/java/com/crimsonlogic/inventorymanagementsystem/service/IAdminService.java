package com.crimsonlogic.inventorymanagementsystem.service;

import com.crimsonlogic.inventorymanagementsystem.entity.Admin;

import java.util.List;

public interface IAdminService {
    List<Admin> getAllAdmins();

    void saveAdmin(Admin admin);
}
