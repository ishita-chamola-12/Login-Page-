package com.example.BackendLogin.repository;

import com.example.BackendLogin.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.BackendLogin.entity.ERole;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Long> {
    Optional<Role> findByName(ERole name);
}
