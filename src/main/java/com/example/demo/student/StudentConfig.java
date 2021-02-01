package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
          Student islom =  new Student(
                    "Islom",
                    "Islom@mail.com",
                    LocalDate.of(1997, Month.SEPTEMBER, 13)
            );

          Student mariam = new Student(
                  "Mariam",
                  "Mariam@mail.com",
                  LocalDate.of(2003, Month.APRIL, 7)
          );

          repository.saveAll(
                  List.of(islom, mariam)
          );
        };
    };

}
