package com.example.spring_boot_people_directory;

import com.example.spring_boot_people_directory.entity.People;
import com.example.spring_boot_people_directory.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class SpringBootPeopleDirectoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootPeopleDirectoryApplication.class, args);
    }

}
