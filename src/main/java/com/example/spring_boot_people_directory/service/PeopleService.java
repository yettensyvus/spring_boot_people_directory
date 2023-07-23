package com.example.spring_boot_people_directory.service;

import com.example.spring_boot_people_directory.entity.People;

import java.util.List;

public interface PeopleService {

    List<People> get_all_people();

    People save_people(People people);
}
