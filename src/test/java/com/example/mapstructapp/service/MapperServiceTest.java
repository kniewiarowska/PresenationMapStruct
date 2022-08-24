package com.example.mapstructapp.service;

import com.example.mapstructapp.ex6.mapper.BossMapperImpl;
import com.example.mapstructapp.ex6.model.Boss;
import com.example.mapstructapp.ex6.model.Department;
import com.example.mapstructapp.ex6.model.Employee;
import org.assertj.core.util.Strings;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;

import java.time.LocalDate;

class MapperServiceTest {

    MapperService mapperService = new MapperService(new BossMapperImpl());

    @Test
    void testPromoteEmployee() {

        Employee employee = Employee.builder()
                .name("Jan")
                .surname("Kowalski")
                .brithDate(LocalDate.of(1985, 10, 14))
                .department(Department.HR)
                .build();

        Boss boss = mapperService.promoteEmployee(employee, 100000);
        Assertions.assertEquals(boss.getFullName(), employee.getName().concat(" ").concat(employee.getSurname()));
    }
}