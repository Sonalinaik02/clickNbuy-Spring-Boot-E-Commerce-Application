package com.jsp.shopping.service;

import java.util.List;
import com.jsp.shopping.entity.Admin;

public interface AdminService {
    Admin saveAdmin(Admin admin);
    List<Admin> getAllAdmins();
}