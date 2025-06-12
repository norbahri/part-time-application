package com.example.parttimeapplication.controller;

import com.example.parttimeapplication.dto.UserDto;
import com.example.parttimeapplication.service.UserService;
import com.example.parttimeapplication.util.TbConstants;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    // Login page
    @GetMapping("/login")
    public String login() {
        return TbConstants.LOGIN_VIEW;
    }

    // Registration page
    @GetMapping("/registration")
    public String showRegistrationForm(Model model) {
        UserDto user = new UserDto();
        model.addAttribute("user", user);
        return TbConstants.REGISTRATION_VIEW;
    }

    // Handle user registration
    @PostMapping("/registration")
    public String registerUser(@Valid @ModelAttribute("user") UserDto userDto,
                               BindingResult result,
                               Model model) {

        // Check if user already exists
        if (userService.existsByEmail(userDto.getEmail())) {
            result.rejectValue("email", "error.user", "Email already exists");
        }

        if (result.hasErrors()) {
            model.addAttribute("user", userDto);
            return TbConstants.REGISTRATION_VIEW;
        }

        userService.saveUser(userDto);
        return TbConstants.REDIRECT_REGISTRATION + "?success";
    }

    // Home page - redirect to login
    @GetMapping("/")
    public String home() {
        return TbConstants.REDIRECT_LOGIN;
    }
}