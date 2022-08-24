package com.example.mapstructapp.ex6.mapper;

import com.example.mapstructapp.ex5.mapper.TaskMapper;
import com.example.mapstructapp.ex6.model.Boss;
import com.example.mapstructapp.ex6.model.Employee;
import org.apache.commons.lang3.StringUtils;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = TaskMapper.class, imports = StringUtils.class, componentModel = "spring")
public interface BossMapper {

    @Mapping(target = "fullName", expression = "java(employee.getName().concat(StringUtils.SPACE).concat(employee.getSurname()))")
    @Mapping(target = "experienceInYears", source = "employee.experience", defaultValue = "10")
    @Mapping(target = "salary", source = "salary", numberFormat = "$#.00")
    @Mapping(target = "tasks", ignore = true)
    Boss toBoss(Employee employee, double salary);

}
