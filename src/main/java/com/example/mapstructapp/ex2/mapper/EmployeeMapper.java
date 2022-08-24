package com.example.mapstructapp.ex2.mapper;

import com.example.mapstructapp.ex2.model.Employee;
import com.example.mapstructapp.ex2.model.EmployeeDTO;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = TaskMapper.class)
public interface EmployeeMapper {

    @Mapping(target = "firstName", source = "name")
    @Mapping(target = "lastName", source = "surname")
    @Mapping(target = "age", source = "age")
    @Mapping(target = "department", source = "department")
    @Mapping(target = "task", source = "task")
    EmployeeDTO toEmployeeDTO(Employee employee);

     /*
        We have three options to map "Task to TaskDTO"

        1) We can write a mapper - -> not recommended:
        default TaskDTO toTaskDto(Task task)

        2) We can attach mapping class:
         @Mapper(uses = TaskMapper.class)

     */

    @InheritConfiguration
    @Mapping(target = "task", ignore = true)
    EmployeeDTO mapToEmployeeDtoWithoutTask(Employee employee);

      /*

        We can inherit configuration to write a mapper with different behavior.
        Mapper with @InheritConfiguration can for example override behavior or add new mapping for new filed.

     */

    @InheritInverseConfiguration(name = "toEmployeeDTO")
    Employee toEmployee(EmployeeDTO employeeDTO);

    /*
        We can inherit configuration to create reverse mapping
        by usage of @InheritInverseConfiguration annotation.
        It is also necessary to add @InheritInverseConfiguration in TaskMapper.
     */


}
