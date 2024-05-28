package com.example.pizza_ordering_system.repository;
import com.example.pizza_ordering_system.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {}
