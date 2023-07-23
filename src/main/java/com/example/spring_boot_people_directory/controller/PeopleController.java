package com.example.spring_boot_people_directory.controller;

import com.example.spring_boot_people_directory.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PeopleController {
    private PeopleService peopleService;

    public PeopleController(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    @GetMapping("/peoples")
    public String list_of_peoples(Model model)
    {
        model.addAttribute("peoples", peopleService.get_all_people());
        return "peoples";
    }
}
