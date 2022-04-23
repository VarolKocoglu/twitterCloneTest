package com.example.twitterCloneTest.service;

import com.example.twitterCloneTest.model.Person;

import java.util.List;

public interface IPersonService {
    public List<Person> getAllPerson();
    public void addPerson(Person person);
}
