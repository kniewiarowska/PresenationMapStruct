package com.example.mapstructapp.ex4.mapper;

import com.example.mapstructapp.ex4.mapper.qualifier.CalculateYears;
import com.example.mapstructapp.ex4.model.Employee;
import com.example.mapstructapp.ex4.model.EmployeeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = TaskMapper.class)
public interface EmployeeMapper extends MapperMethods {

    @Mapping(target = "firstName", source = "name")
    @Mapping(target = "lastName", source = "surname")
    @Mapping(target = "age", source = "brithDate", qualifiedBy = CalculateYears.class)
    @Mapping(target = "department", source = "department")
    @Mapping(target = "task", source = "task")
    EmployeeDTO toEmployeeDTO(Employee employee);

}