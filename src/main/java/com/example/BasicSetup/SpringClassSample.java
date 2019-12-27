package com.example.BasicSetup;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringClassSample {
  @GetMapping("/helloWorld")
  public String helloWorld() {
    return "Hello to SPRING!!";
  }
}
