package com.example.mapstructapp.ex5.mapper;

import com.example.mapstructapp.ex5.model.DepartmentFullName;
import com.example.mapstructapp.ex5.model.Department;
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
