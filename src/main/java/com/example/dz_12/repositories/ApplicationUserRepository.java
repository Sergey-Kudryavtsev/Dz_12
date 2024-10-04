package com.example.dz_12.repositories;


import com.example.dz_12.model.secuirty.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Integer> {
    Optional<ApplicationUser> findApplicationUserByProfileEmail(String email);
}
