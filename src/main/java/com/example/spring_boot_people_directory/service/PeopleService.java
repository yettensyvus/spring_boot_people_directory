package com.example.spring_boot_people_directory.service;

import com.example.spring_boot_people_directory.entity.People;

import java.util.List;

public interface PeopleService {

    List<People> get_all_people();

    People save_people(People people);
    People get_people_by_id(Long id);
    People update_people(People people);
    void delete_people_by_id(Long id);
}
