package org.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.training.entity.UserCredential;

import java.util.Optional;

public interface UserCredentialRepository  extends JpaRepository<UserCredential,Integer> {
    Optional<UserCredential> findByName(String username);
}
