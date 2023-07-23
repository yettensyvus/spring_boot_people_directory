package com.example.spring_boot_people_directory.repository;

import com.example.spring_boot_people_directory.entity.People;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends JpaRepository<People, Long> {

}
