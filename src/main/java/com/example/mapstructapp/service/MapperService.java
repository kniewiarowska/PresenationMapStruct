package com.example.mapstructapp.service;

import com.example.mapstructapp.ex6.mapper.BossMapper;
import com.example.mapstructapp.ex6.model.Boss;
import com.example.mapstructapp.ex6.model.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MapperService {

    private final BossMapper bossMapper;

    public Boss promoteEmployee(Employee employee, double salary) {
        return bossMapper.toBoss(employee, salary);
    }
}
