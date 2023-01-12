package com.testepatobranco.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testepatobranco.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
