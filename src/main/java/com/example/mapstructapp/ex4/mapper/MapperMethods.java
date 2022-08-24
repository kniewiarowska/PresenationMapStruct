package com.example.mapstructapp.ex4.mapper;

import com.example.mapstructapp.ex4.mapper.qualifier.CalculateYears;

import java.time.LocalDate;
import java.time.Period;

public interface MapperMethods {

    @CalculateYears
    default int calculateAge(LocalDate birthDate) {
        LocalDate today = LocalDate.now();
        return Period.between(birthDate, today).getYears();
    }
}
