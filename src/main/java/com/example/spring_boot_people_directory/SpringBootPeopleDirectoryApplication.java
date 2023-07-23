package com.example.spring_boot_people_directory;

import com.example.spring_boot_people_directory.entity.People;
import com.example.spring_boot_people_directory.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class SpringBootPeopleDirectoryApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootPeopleDirectoryApplication.class, args);
    }

    @Autowired
    private PeopleRepository peopleRepository;
    @Override
    public void run(String... args) throws Exception {
        /*
        People p1 = new People("Alex", "Straton", LocalDate.parse("2005-05-05"), "+3734511564", "alex@mail.ru");
        peopleRepository.save(p1);
        */
    }
}
