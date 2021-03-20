package com.pdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pdev.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
