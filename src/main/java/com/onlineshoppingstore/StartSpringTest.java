package com.onlineshoppingstore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StartSpringTest {
  private static final Logger logger = LoggerFactory.getLogger(StartSpringTest.class);

  public static void main(String[] args) {
    ApplicationContext applicationContext = SpringApplication.run(StartSpringTest.class, args);
  }
}
