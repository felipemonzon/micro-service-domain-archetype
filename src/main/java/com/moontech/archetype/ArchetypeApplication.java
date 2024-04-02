package com.moontech.archetype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class ArchetypeApplication {

  public static void main(String[] args) {
    SpringApplication.run(ArchetypeApplication.class, args);
  }
}
