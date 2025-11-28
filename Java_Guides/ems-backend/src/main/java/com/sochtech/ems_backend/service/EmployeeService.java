package com.sochtech.ems_backend.service;

import com.sochtech.ems_backend.dto.EmployeeDto;

import java.util.List;
// import com.sochtech.ems_backend.entity.Employee;

public interface EmployeeService
{
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeId);

    List<EmployeeDto> getAllEmployees();

    EmployeeDto updateEmployee(Long employeeId, EmployeeDto updatedEmployee);

    void deleteEmployee(Long employeeId);
}
