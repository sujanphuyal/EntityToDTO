package com.springoot.EntityToDTO.repository;

import com.springoot.EntityToDTO.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
