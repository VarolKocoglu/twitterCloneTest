package com.example.twitterCloneTest.dao;

import com.example.twitterCloneTest.model.Person;

import java.util.List;

public interface IPersonDao {
    public List<Person> getAllPerson();
    public void addPerson(Person person);
}
