package com.example.spring_boot_people_directory.service.impl;

import com.example.spring_boot_people_directory.entity.People;
import com.example.spring_boot_people_directory.repository.PeopleRepository;
import com.example.spring_boot_people_directory.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeopleServiceImpl implements PeopleService {

    private PeopleRepository peopleRepository;

    public PeopleServiceImpl(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    @Override
    public List<People> get_all_people() {
        return peopleRepository.findAll();
    }

    @Override
    public People save_people(People people) {
        return peopleRepository.save(people);
    }
}
