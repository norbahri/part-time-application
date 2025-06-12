package com.example.parttimeapplication.service;


import com.example.parttimeapplication.dto.UserDto;
import com.example.parttimeapplication.model.User;

public interface UserService {

    /**
     * Save user from UserDto
     * @param userDto the user data transfer object
     */
    void saveUser(UserDto userDto);

    /**
     * Find user by email
     * @param email the email address
     * @return User object or null if not found
     */
    User findByEmail(String email);

    /**
     * Check if user exists by email
     * @param email the email address
     * @return true if user exists, false otherwise
     */
    boolean existsByEmail(String email);
}