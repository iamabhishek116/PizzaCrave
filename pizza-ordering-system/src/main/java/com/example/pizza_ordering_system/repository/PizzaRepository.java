package com.example.pizza_ordering_system.repository;
import com.example.pizza_ordering_system.model.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Pizza, Long> {}