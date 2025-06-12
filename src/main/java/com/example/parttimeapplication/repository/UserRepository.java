package com.example.parttimeapplication.repository;


import com.example.parttimeapplication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * Find user by email address
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