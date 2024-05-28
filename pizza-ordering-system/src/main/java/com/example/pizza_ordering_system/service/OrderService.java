package com.example.pizza_ordering_system.service;

import com.example.pizza_ordering_system.model.Order;
import com.example.pizza_ordering_system.model.User;
import com.example.pizza_ordering_system.repository.OrderRepository;
import com.example.pizza_ordering_system.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private UserRepository userRepository;

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    // Other methods for order processing
}
