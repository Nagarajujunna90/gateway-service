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
        return new ResponseEntity<>("Due to server issue not able to serve you", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/userServiceFallBack")
    public ResponseEntity<?> userServiceFallBack() {
        return new ResponseEntity<>("Due to server issue not able to serve you", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/orderServiceFallBack")
    public ResponseEntity<?> orderServiceFallback() {
     return  new ResponseEntity<>("Order service is down!", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/paymentServiceFallBack")
    public ResponseEntity<?> paymentServiceFallback() {
        return   new ResponseEntity<>("Payment service is down!", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/productServiceFallBack")
    public ResponseEntity<?> productServiceFallback() {
        return  new ResponseEntity<>("Product service is down!", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/cartServiceFallBack")
    public ResponseEntity<?> cartServiceFallback() {
        return  new ResponseEntity<>("Cart service is down!", HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
