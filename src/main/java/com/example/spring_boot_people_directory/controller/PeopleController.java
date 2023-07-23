package com.example.spring_boot_people_directory.controller;

import com.example.spring_boot_people_directory.entity.People;
import com.example.spring_boot_people_directory.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PeopleController {
    private PeopleService peopleService;

    public PeopleController(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    //return people list as model and view
    @GetMapping("/peoples")
    public String list_of_peoples(Model model)
    {
        model.addAttribute("peoples", peopleService.get_all_people());
        return "peoples";
    }

    //
    @GetMapping("/peoples/add")
    public String add_peoples(Model model)
    {
        People people = new People();
        model.addAttribute("people", people);
        return "add_people";
    }

    @PostMapping("/peoples")
    public String save_people(@ModelAttribute("people") People people)
    {
        peopleService.save_people(people);
        return "redirect:/peoples";
    }

    @GetMapping("/peoples/update/{id}")
    public String update_people_form(@PathVariable Long id, Model model)
    {
        model.addAttribute("people", peopleService.get_people_by_id(id));
        return "update_people";
    }

    @PostMapping("/peoples/{id}")
    public String update_people(@PathVariable Long id, @ModelAttribute("people") People people, Model model)
    {
        People p_exist = peopleService.get_people_by_id(id);

        p_exist.setId_people(id);
        p_exist.setName(people.getName());
        p_exist.setSurname(people.getSurname());
        p_exist.setDate_of_birth(people.getDate_of_birth());
        p_exist.setNumber(people.getNumber());
        p_exist.setEmail(people.getEmail());

        peopleService.update_people(p_exist);

        return "redirect:/peoples";
    }
}
