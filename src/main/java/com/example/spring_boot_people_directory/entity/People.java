package com.example.spring_boot_people_directory.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "people")
public class People {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_people;

    @Column(name = "people_name", nullable = false)
    private String name;

    @Column(name = "people_surname", nullable = false)
    private String surname;

    @Column(name = "people_date_of_birth", nullable = false)
    private LocalDate date_of_birth;

    @Column(name = "people_p_number", nullable = false)
    private String number;

    @Column(name = "people_email", nullable = false)
    private String email;

    public int getId_people() {
        return id_people;
    }

    public void setId_people(int id_people) {
        this.id_people = id_people;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(LocalDate date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public People() {
    }

    public People(String name, String surname, LocalDate date_of_birth, String number, String email) {
        this.name = name;
        this.surname = surname;
        this.date_of_birth = date_of_birth;
        this.number = number;
        this.email = email;
    }
}
