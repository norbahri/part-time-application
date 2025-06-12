package com.example.parttimeapplication.controller;


import com.example.parttimeapplication.util.TbConstants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    // User dashboard
    @GetMapping("/user")
    public String user() {
        return TbConstants.USER_VIEW;
    }

    // Admin dashboard (optional - for future use)
    @GetMapping("/admin")
    public String admin() {
        return "admin"; // You can create admin.html later
    }
}