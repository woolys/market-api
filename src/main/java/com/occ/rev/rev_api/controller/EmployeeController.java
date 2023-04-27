package com.occ.rev.rev_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.occ.rev.rev_api.model.Employee;
import com.occ.rev.rev_api.service.EmployeeService;

public class EmployeeController {
	@Autowired
    private EmployeeService employeeService;

    /**
    * Read - Get all employees
    * @return - An Iterable object of Employee full filled
    */
    @GetMapping("/employees")
    public Iterable<Employee> getEmployees() {
        return employeeService.getEmployees();
    }
}
