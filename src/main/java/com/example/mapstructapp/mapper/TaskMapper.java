package com.example.mapstructapp.mapper;

import com.example.mapstructapp.model.Task;
import com.example.mapstructapp.model.TaskDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

@Mapper
public interface TaskMapper {

    @Mapping(target = "name", source = "title")
    @Mapping(target = "description", source = "description")
    @Mapping(target = "storyPoints", source = "days")
    @Mapping(target = "importance", constant = "low")
    TaskDTO toTask(Task task);

    List<TaskDTO> toTasksDtoList(Set<Task> tasks);

}
