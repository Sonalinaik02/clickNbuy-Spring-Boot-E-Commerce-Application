package com.jsp.shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.shopping.service.AdminService;
import com.jsp.shopping.entity.Admin;      // adjust package if different
//import com.jsp.shopping.dto.AdminDto;    // adjust or remove if you don't have this

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;   // no 'final', no constructor needed

    // Example: create admin (adjust to match your service)
    @PostMapping("/save")
    public ResponseEntity<?> saveAdmin(@RequestBody Admin admin) {
        return ResponseEntity.ok(adminService.saveAdmin(admin));
    }

    // Example: get all admins (adjust to match your service)
    @GetMapping("/all")
    public ResponseEntity<?> getAllAdmins() {
        return ResponseEntity.ok(adminService.getAllAdmins());
    }

    // You can add more endpoints here based on your AdminService methods.
}