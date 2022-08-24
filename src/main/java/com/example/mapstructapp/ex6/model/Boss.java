package com.example.mapstructapp.ex6.model;

import lombok.Data;

import java.util.List;

@Data
public class Boss {

    private String fullName;
    private int age;
    private int experienceInYears;
    private String experience;
    private List<Task> tasks;
    private String salary;

}
