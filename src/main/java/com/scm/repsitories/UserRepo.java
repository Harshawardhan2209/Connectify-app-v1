package com.scm.repsitories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scm.entities.User;

@Repository
public interface UserRepo extends JpaRepository<User, String> {
    // extra methods db relate operations
    // custom query methods
    // custom finder methods

    // Services used here are MailiStrap Service
    // can be same for other mailing services
    Optional<User> findByEmail(String email);

    Optional<User> findByEmailAndPassword(String email, String password);

    Optional<User> findByEmailToken(String id);

}