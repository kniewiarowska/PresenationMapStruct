package com.example.mapstructapp.ex2.mapper;

import com.example.mapstructapp.ex5.model.Task;
import com.example.mapstructapp.ex5.model.TaskDTO;
import org.mapstruct.*;

@Mapper
public interface TaskMapper {

    @Mapping(target = "name", source = "title")
    @Mapping(target = "description", source = "description")
    @Mapping(target = "storyPoints", source = "days")
    @Mapping(target = "importance", constant = "low")
    TaskDTO toTaskDTO(Task task);

    @InheritInverseConfiguration(name = "toTaskDTO")
    Task toTask(TaskDTO taskDTO);

      /*
        Without @InheritInverseConfiguration fields with
        different fields names won't be mapped.
     */

}
