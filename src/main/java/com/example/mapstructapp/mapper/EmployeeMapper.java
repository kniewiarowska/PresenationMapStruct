package com.example.mapstructapp.mapper;

import com.example.mapstructapp.model.Employee;
import com.example.mapstructapp.model.EmployeeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

//@Mapper(uses = TaskMapper.class)
public interface EmployeeMapper {

    @Mapping(target = "firstName", source = "employee.name")
    @Mapping(target = "lastName", source = "employee.surname")
    @Mapping(target = "age", source = "age")
    @Mapping(target = "department", source = "department")
    @Mapping(target = "task", source = "task")
    EmployeeDTO toEmployeeDto(Employee employee);

    /*
        We have three options to map "Task to TaskDTO"

        1) We can write a mapper - -> not recommended:
        default TaskDTO toTaskDto(Task task)

        2) We can attach mapping class:
         @Mapper(uses = TaskMapper.class)

     */
}
