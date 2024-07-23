package com.mycompany.webapp.controller;

import com.mycompany.webapp.model.Employee;
import com.mycompany.webapp.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping ("/api/v1/")
public class EmployeeController {

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee) {
            return employeeService.createEmployee(employee);
    }

}
