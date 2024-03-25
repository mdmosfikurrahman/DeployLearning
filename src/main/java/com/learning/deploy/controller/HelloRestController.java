package com.learning.deploy.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloRestController {

    @GetMapping("/hello")
    public ResponseEntity<Map<String, String>> hello() {
        Map<String, String> jsonResponse = new HashMap<>();
        jsonResponse.put("message", "Hello, Deploy Learning!");

        return ResponseEntity.ok(jsonResponse);
    }
}

