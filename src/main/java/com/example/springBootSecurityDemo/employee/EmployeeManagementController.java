package com.example.springBootSecurityDemo.employee;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("management/api/v1/employees")
public class EmployeeManagementController {

    private static final List<Employee> EMPLOYEES = Arrays.asList(
            new Employee(1, "Laravel"),
            new Employee(2, "Mba"),
            new Employee(3, "Fatima")
    );


    @GetMapping
    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_ADMINTRAINEE')")
    public List<Employee> getAllEmployees(){
        return EMPLOYEES;
    }

    @PostMapping
    @PreAuthorize("hasAuthority('employee: write')")
    public void hireNewEmployee(@RequestBody Employee employee){
        System.out.println(employee);
    }

    @DeleteMapping(path = "{employeeId}")
    @PreAuthorize("hasAuthority('employee: write')")
    public void deleteEmployee(@PathVariable("employeeId") Integer employeeId){
        System.out.println(employeeId);
    }

    @PutMapping(path = "{employeeId}")
    @PreAuthorize("hasAuthority('employee: write')")
    public void updateEmployee(@PathVariable("employeeId") Integer employeeId, @RequestBody Employee employee){
        System.out.printf("%s %s%n", employeeId, employee);
    }
}
