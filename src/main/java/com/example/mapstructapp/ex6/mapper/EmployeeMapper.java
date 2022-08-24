package com.example.mapstructapp.ex6.mapper;

import com.example.mapstructapp.ex6.model.Employee;
import com.example.mapstructapp.ex6.model.EmployeeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = TaskMapper.class)
public interface EmployeeMapper {

    @Mapping(target = "firstName", source = "name")
    @Mapping(target = "lastName", source = "surname")
    @Mapping(target = "age", source = "age")
    @Mapping(target = "department", source = "department")
    @Mapping(target = "tasks", source = "tasks")
    EmployeeDTO toEmployeeDTO(Employee employee);

}
