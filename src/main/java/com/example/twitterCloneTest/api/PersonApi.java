package com.example.twitterCloneTest.api;

import com.example.twitterCloneTest.model.Person;
import com.example.twitterCloneTest.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonApi {

    @Autowired
    private IPersonService personService;

    @GetMapping("all/person")
    public List<Person> getAllPerson() {
        return personService.getAllPerson();
    }

    @PostMapping("add/person")
    public void addPerson(@RequestBody Person person) {
        personService.addPerson(person);
    }

}
