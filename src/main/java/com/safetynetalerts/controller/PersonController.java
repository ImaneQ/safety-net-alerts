package com.safetynetalerts.controller;

import com.safetynetalerts.model.*;
import com.safetynetalerts.service.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping(path = "/person")
public class PersonController {


    public final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public List<Person> allPersons() {
        return List.of(new Person("Dupont", "Jules", "1 rue de la république Paris", "060606060606"));
    }

    @PostMapping
    public void addPerson(@RequestBody Person person) {
        personService.addPerson(person);
    }

    @PutMapping(path = "{adress}")
    public void updateStudent(@PathVariable("adress") String adress ,@PathVariable("phone") String phone, @RequestParam(required = false) String firstName, @RequestParam(required = false) String lastName) {
        personService.updatePerson();
    }

    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long personId){
        personService.deletePerson(personId);
    }
}
