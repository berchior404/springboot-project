package com.pdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pdev.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
