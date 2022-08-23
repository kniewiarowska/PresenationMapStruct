package com.example.mapstructapp.model;

import lombok.Data;

import java.time.LocalDate;
import java.util.Set;

@Data
public class EmployeeDTO {

    private String firstName;
    private String lastName;
    private int age;
    private String department;
    private LocalDate brithDate;
    private String contractType;
    private Set<Task> tasksSet;
}
