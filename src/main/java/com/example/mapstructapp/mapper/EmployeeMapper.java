package com.example.mapstructapp.mapper;

import com.example.mapstructapp.model.Employee;
import com.example.mapstructapp.model.EmployeeDTO;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = {TaskMapper.class, DepartmentMapper.class})
public interface EmployeeMapper {

    @Mapping(target = "firstName", source = "name")
    @Mapping(target = "lastName", source = "surname")
    @Mapping(target = "age", source = "age")
    @Mapping(target = "department", source = "department")
    @Mapping(target = "tasks", source = "tasks")
    EmployeeDTO toEmployeeDto(Employee employee);

    /*
        Collections can be mapped by dedicated method from TaskMapper.class.
        Mapping between different collection types is possible.

     */

    @InheritConfiguration
    @Mapping(target = "tasks", ignore = true)
    EmployeeDTO mapToEmployeeDtoWithoutTasks(Employee employee);

      /*

        We can inherit configuration to write a mapper ith different behavior.
        Mapper with @InheritConfiguration can for example override or add new mapping.

     */
}
