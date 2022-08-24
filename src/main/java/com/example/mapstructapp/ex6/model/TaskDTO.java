package com.example.mapstructapp.ex6.model;

import lombok.Data;

@Data
public class TaskDTO {

    private String name;
    private String description;
    private int storyPoints;
    private String importance;

}
