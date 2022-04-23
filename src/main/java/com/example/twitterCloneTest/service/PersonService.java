package com.example.twitterCloneTest.service;

import com.example.twitterCloneTest.dao.IPersonDao;
import com.example.twitterCloneTest.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService implements IPersonService{

    @Autowired
    private IPersonDao personDao;

    @Override
    public List<Person> getAllPerson() {
        return personDao.getAllPerson();
    }

    @Override
    public void addPerson(Person person) {
        personDao.addPerson(person);
    }
}
