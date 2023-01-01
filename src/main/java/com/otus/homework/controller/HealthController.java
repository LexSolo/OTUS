package com.otus.homework.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HealthController {

  @GetMapping("health/")
  public ResponseEntity<Void> checkHealth() {
    return ResponseEntity.ok().build();
  }
}
