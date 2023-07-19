package com.example.gatewayservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
    @PostMapping("/userServiceFallBack")
    public ResponseEntity<?> fallback() {
        return new ResponseEntity<>("Due to server issue not able to serve you", HttpStatus.TOO_MANY_REQUESTS);
    }
    @GetMapping("/userServiceFallBack")
    public ResponseEntity<?> falldback() {
        return new ResponseEntity<>("Due to server issue not able to serve you", HttpStatus.TOO_MANY_REQUESTS);
    }
    @GetMapping("/orderServiceFallBack")
    public String orderServiceFallback() {
        return "Order service is down!";
    }

    @GetMapping("/paymentServiceFallBack")
    public String paymentServiceFallback() {
        return "Payment service is down!";
    }

    @GetMapping("/productServiceFallBack")
    public String productServiceFallback() {
        return "Product service is down!";
    }
}
