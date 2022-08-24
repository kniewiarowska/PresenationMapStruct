package com.example.mapstructapp.ex6.model;

import lombok.Data;

import java.util.List;

@Data
public class EmployeeDTO {

    private String firstName;
    private String lastName;
    private int age;
    private String department;
    private String contractType;
    private List<TaskDTO> tasks;

}
