package com.example.parttimeapplication.service;


import com.example.parttimeapplication.dto.UserDto;
import com.example.parttimeapplication.model.Role;
import com.example.parttimeapplication.model.User;
import com.example.parttimeapplication.repository.RoleRepository;
import com.example.parttimeapplication.repository.UserRepository;
import com.example.parttimeapplication.util.TbConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void saveUser(UserDto userDto) {
        User user = new User();
        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        user.setPassword(passwordEncoder.encode(userDto.getPassword()));

        // Assign default role
        Role role = roleRepository.findByName(TbConstants.DEFAULT_ROLE);
        if (role == null) {
            role = new Role(TbConstants.DEFAULT_ROLE);
            roleRepository.save(role);
        }

        Set<Role> roles = new HashSet<>();
        roles.add(role);
        user.setRoles(roles);

        userRepository.save(user);
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public boolean existsByEmail(String email) {
        return userRepository.existsByEmail(email);
    }
}