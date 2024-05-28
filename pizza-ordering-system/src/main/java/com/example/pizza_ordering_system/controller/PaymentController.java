package com.example.pizza_ordering_system.controller;

import com.example.pizza_ordering_system.service.PaymentService;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public ResponseEntity<String> charge(@RequestParam String token, @RequestParam double amount) {
        try {
            Charge charge = paymentService.createCharge(token, amount);
            return ResponseEntity.ok("Payment successful with charge ID: " + charge.getId());
        } catch (StripeException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Payment failed: " + e.getMessage());
        }
    }
}
