package com.example.twitterCloneTest.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {

    private String name;
    private String username;
    private String email;
    private String password;

}
