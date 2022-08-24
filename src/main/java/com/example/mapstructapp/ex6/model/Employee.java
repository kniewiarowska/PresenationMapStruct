
package com.example.mapstructapp.ex6.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
public class Employee {

    private String name;
    private String surname;
    private int age;
    private Department department;
    private int experience;
    private LocalDate brithDate;
    private List<Task> tasks;

}