package com.example.springBootSecurityDemo.employee;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/v1/employees")
public class EmployeeController {

    private static final List<Employee> EMPLOYEES = Arrays.asList(
            new Employee(1, "Laravel"),
            new Employee(2, "Mba"),
            new Employee(3, "Fatima")
    );
    @GetMapping(path = "{employeeId}")
    public Employee getEmployee(@PathVariable("employeeId") Integer employeeId){
        return EMPLOYEES.stream()
                .filter(employee -> employeeId.equals(employee.getEmployeeId()))
                .findFirst()
                .orElseThrow(()-> new IllegalStateException("Employee " + employeeId + " does not exist" ));
    }
}
