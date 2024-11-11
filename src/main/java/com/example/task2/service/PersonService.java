package com.example.task2.service;

import com.example.task2.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    private List<Person> persons = new ArrayList<>();


    public List<Person> getAllContacts() {
        return persons;
    }


    public String addPerson(Person person) {

        for (Person p : persons) {
            if (p.getEmail().equals(person.getEmail())) {
                return "Contact already exists with this email!";
            }
        }
        persons.add(person);
        return "Person Added Successfully";
    }
}
