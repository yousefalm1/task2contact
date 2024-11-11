package com.example.task2.controller;


import com.example.task2.service.PersonService;
import com.example.task2.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AppController {

    private final PersonService personService;

    @Autowired
    public AppController(PersonService personService) {
        this.personService = personService;
    }


    @GetMapping("/getContactDetails")
    public List<Person> getAllContacts() {
        return personService.getAllContacts();
    }


    @PostMapping("/addContact")
    public String addPerson(@RequestBody Person person) {
        return personService.addPerson(person);
    }

}
