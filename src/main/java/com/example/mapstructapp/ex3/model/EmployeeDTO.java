package com.example.mapstructapp.ex3.model;

import lombok.Data;

@Data
public class EmployeeDTO {

    private String firstName;
    private String lastName;
    private int age;
    private String department;
    private String contractType;
    private TaskDTO task;

}
