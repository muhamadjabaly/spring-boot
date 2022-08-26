package com.example.spring_boot.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
     return args -> {
         Student muhammedJabaly = new Student(
                 "Muhammed Jabaly",
                 "test@test.com",
                 LocalDate.of(1999,1,3));
         Student mariam = new Student(
                 "mariam",
                 "test@test.com",
                 LocalDate.of(1988,1,3));
         repository.saveAll(List.of(muhammedJabaly,mariam));
     };
    }
}
