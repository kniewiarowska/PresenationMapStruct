package com.example.mapstructapp.mapper;

import com.example.mapstructapp.model.Employee;
import com.example.mapstructapp.model.EmployeeDTO;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = TaskMapper.class)
public interface EmployeeMapper {

    @Mapping(target = "firstName", source = "employee.name")
    @Mapping(target = "lastName", source = "employee.surname")
    @Mapping(target = "age", source = "age")
    @Mapping(target = "department", source = "department")
    @Mapping(target = "tasks", source = "tasks")
    EmployeeDTO toEmployeeDto(Employee employee);

    @InheritConfiguration
    @Mapping(target = "tasks", ignore = true)
    EmployeeDTO mapToEmployeeDtoWithoutTasks(Employee employee);
}
