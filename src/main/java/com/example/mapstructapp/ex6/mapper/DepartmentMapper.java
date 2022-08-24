package com.example.mapstructapp.ex6.mapper;

import com.example.mapstructapp.ex6.model.Department;
import com.example.mapstructapp.ex6.model.DepartmentFullName;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ValueMapping;

@Mapper
public interface DepartmentMapper {

    @ValueMapping(target = "PAYMENTS", source = "PAYMENTS" )
    @ValueMapping(target = "HUMAN_RESOURCES", source = "HR")
    @ValueMapping(target = "PUBLIC_RELATIONS", source = "PR")
    @ValueMapping(source =  MappingConstants.ANY_REMAINING ,target = "OTHER")
    DepartmentFullName toDepartmentFullName(Department department);
}
