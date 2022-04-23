package com.example.twitterCloneTest.dao;

import com.example.twitterCloneTest.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class PersonDao implements IPersonDao {

    private ArrayList<Person> db = new ArrayList<>(
            Arrays.asList(
                    new Person("varol1", "vk", "vk@vk.com", "saddam"),
                    new Person("varol2", "vk", "vk@vk.com", "saddam"),
                    new Person("varol3", "vk", "vk@vk.com", "saddam"),
                    new Person("varol4", "vk", "vk@vk.com", "saddam")

            )
    );

    @Override
    public List<Person> getAllPerson() {
        return db;
    }

    @Override
    public void addPerson(Person person) {
        db.add(person);
    }
}
