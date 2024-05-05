package com.example.Portfolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Portfolio.entities.User;



public interface UserRepository extends JpaRepository<User, Long> {

}
