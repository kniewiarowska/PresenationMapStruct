package com.example.mapstructapp.ex1.mapper;

import com.example.mapstructapp.ex1.model.Employee;
import com.example.mapstructapp.ex1.model.EmployeeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface EmployeeMapper {

    @Mapping(target = "firstName", source = "name")
    @Mapping(target = "lastName", source = "surname")
    @Mapping(target = "age", source = "age")
    @Mapping(target = "department", source = "department")
    @Mapping(target = "task",  ignore = true)
    EmployeeDTO toEmployeeDTO(Employee employee);

}
