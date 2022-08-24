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

    @InheritConfiguration(name = "toTaskDTO")
    @Mapping(target = "importance", constant = "high")
    @Named("toTaskDtoWithHighImportance")
    TaskDTO toTaskDTOWithHighImportance(Task task);

    @Named("tasksDTOWithHighImportance")
    @IterableMapping(qualifiedByName = "toTaskDtoWithHighImportance")
    List<TaskDTO> toTasksDtoListWithHighImportance(Set<Task> tasks);
}
