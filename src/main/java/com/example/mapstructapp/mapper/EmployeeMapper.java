package com.example.mapstructapp.mapper;

import com.example.mapstructapp.model.Employee;
import com.example.mapstructapp.model.EmployeeDTO;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(uses = TaskMapper.class)
public interface EmployeeMapper {

    @Mapping(target = "firstName", source = "employee.name")
    @Mapping(target = "lastName", source = "employee.surname")
    @Mapping(target = "age", source = "employee.age")
    @Mapping(target = "department", source = "department")
    void updateOfEmployeeDTO(Employee employee, String department, @MappingTarget EmployeeDTO employeeDTO);
    // Mapper can update an existing object (not create it).

}
