package com.example.mapstructapp.ex3.mapper;

import com.example.mapstructapp.ex3.model.Employee;
import com.example.mapstructapp.ex3.model.EmployeeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.time.LocalDate;
import java.time.Period;

@Mapper(uses = TaskMapper.class)
public interface EmployeeMapper  {

    @Mapping(target = "firstName", source = "name")
    @Mapping(target = "lastName", source = "surname")
    @Mapping(target = "age", source = "brithDate", qualifiedByName = "calculateAge")
    @Mapping(target = "department", source = "department")
    @Mapping(target = "task", source = "task")
    EmployeeDTO toEmployeeDTO(Employee employee);

    @Named("calculateAge")
    default int calculateAge(LocalDate birthDate) {
        LocalDate today = LocalDate.now();
        return Period.between(birthDate, today).getYears();
    }

}