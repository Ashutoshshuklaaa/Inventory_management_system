package com.crimsonlogic.inventorymanagementsystem.controller;

import com.crimsonlogic.inventorymanagementsystem.entity.Admin;
import com.crimsonlogic.inventorymanagementsystem.service.IAdminService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private final IAdminService adminService;

    @Autowired
    public AdminController(IAdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/list")
    public String listAdmins(Model model) {
        List<Admin> admins = adminService.getAllAdmins();
        model.addAttribute("admins", admins);
        return "admin/admin-list"; // Provide the appropriate view name
    }

    @GetMapping("/add")
    public String showAddAdminForm() {
        return "admin/add-admin-form"; // Provide the appropriate view name
    }

    @PostMapping("/add")
    public String addAdmin(@RequestParam("adminName") String adminName,
                           @RequestParam("adminEmail") String adminEmail,
                           @RequestParam("userName") String userName,
                           @RequestParam("adminPassword") String adminPassword,
                           RedirectAttributes redirectAttributes) {

        Admin admin = new Admin(null, "Rama", "ram@gmail.com", "Ram", "Ram@123");
        adminService.saveAdmin(admin);

        redirectAttributes.addFlashAttribute("message", "Admin added successfully");
        return "redirect:/admin/list";
    }
}
