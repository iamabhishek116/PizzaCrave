package com.example.pizza_ordering_system.service;

import com.example.pizza_ordering_system.model.Pizza;
import com.example.pizza_ordering_system.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaService {
    @Autowired
    private PizzaRepository pizzaRepository;

    public List<Pizza> getAllPizzas() {
        return pizzaRepository.findAll();
    }

    // Other methods for CRUD operations
}
