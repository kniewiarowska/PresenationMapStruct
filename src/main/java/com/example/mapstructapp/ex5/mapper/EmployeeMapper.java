package com.example.mapstructapp.ex5.mapper;

import com.example.mapstructapp.ex5.model.Employee;
import com.example.mapstructapp.ex5.model.EmployeeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = {TaskMapper.class, DepartmentMapper.class})
public interface EmployeeMapper {

    @Mapping(target = "firstName", source = "name")
    @Mapping(target = "lastName", source = "surname")
    @Mapping(target = "age", source = "age")
    @Mapping(target = "department", source = "department")
    @Mapping(target = "tasks", source = "tasks", qualifiedByName = "tasksDTOWithHighImportance")
    EmployeeDTO toEmployeeDto(Employee employee);

    /*
        Collections can be mapped by dedicated method from TaskMapper.class.
        Mapping between different collection types is possible.

     */

}
