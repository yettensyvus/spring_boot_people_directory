package com.example.spring_boot_people_directory.controller;

import com.example.spring_boot_people_directory.entity.People;
import com.example.spring_boot_people_directory.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
}
