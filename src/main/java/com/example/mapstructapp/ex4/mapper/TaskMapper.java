package com.example.mapstructapp.ex4.mapper;

import com.example.mapstructapp.ex5.model.Task;
import com.example.mapstructapp.ex5.model.TaskDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface TaskMapper {

    @Mapping(target = "name", source = "title")
    @Mapping(target = "description", source = "description")
    @Mapping(target = "storyPoints", source = "days")
    @Mapping(target = "importance", constant = "low")
    TaskDTO toTaskDTO(Task task);

}
