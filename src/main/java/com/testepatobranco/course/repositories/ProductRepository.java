package com.testepatobranco.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testepatobranco.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
