package com.example.mapstructapp.ex5.model;

import lombok.Data;

import java.time.LocalDate;
import java.util.Set;

@Data
public class Employee {

    private String name;
    private String surname;
    private int age;
    private Department department;
    private LocalDate brithDate;
    private Set<Task> tasks;

}
