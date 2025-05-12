package com.sevkiyat.controller;

import com.sevkiyat.entity.Person;
import com.sevkiyat.service.PersonService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/persons")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public ResponseEntity<Person> createPerson(@RequestBody Person person) {
        Person saved = personService.savePerson(person);
        return ResponseEntity.ok(saved);
    }
    

    @GetMapping
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }
}
