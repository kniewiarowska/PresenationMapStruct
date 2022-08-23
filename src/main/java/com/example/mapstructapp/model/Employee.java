package com.example.mapstructapp.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Employee {

    private String name;
    private String surname;
    private int age;
    private Department department;
    private LocalDate brithDate;
    private Task task;

}
