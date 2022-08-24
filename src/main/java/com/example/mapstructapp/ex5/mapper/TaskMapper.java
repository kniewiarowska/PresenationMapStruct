package com.example.mapstructapp.ex5.mapper;

import com.example.mapstructapp.ex5.model.Task;
import com.example.mapstructapp.ex5.model.TaskDTO;
import org.mapstruct.*;

import java.util.List;
import java.util.Set;

@Mapper
public interface TaskMapper {

    @Mapping(target = "name", source = "title")
    @Mapping(target = "description", source = "description")
    @Mapping(target = "storyPoints", source = "days")
    @Mapping(target = "importance", constant = "low")
    TaskDTO toTaskDTO(Task task);

    List<TaskDTO> toTasksDtoList(Set<Task> tasks);

    @InheritConfiguration
    @Named("toTaskDtoWithHighImportance")
    @Mapping(target = "importance", constant = "low")
    TaskDTO toTaskDTOWithHighImportance(Task task);

    @IterableMapping(qualifiedByName = "toDtoWithHighImportance")
    List<TaskDTO> toTasksDtoListWithHighImportance(Set<Task> tasks);
}
