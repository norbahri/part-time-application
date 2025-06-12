package com.example.parttimeapplication.repository;


import com.example.parttimeapplication.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    /**
     * Find role by name
     * @param name the role name
     * @return Role object or null if not found
     */
    Role findByName(String name);
}