package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @Bean
  CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
    return args -> {
      Student student = new Student();
      student.setFirstName("Kim Ariel");
      student.setLastName("Dequilla");
      student.setEmail("deqkim4@gmail.com");
      student.setAge(23);
      studentRepository.save(student);
    };
  }
}
