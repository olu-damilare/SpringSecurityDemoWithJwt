package com.example.springBootSecurityDemo.employee;

public class Employee {

    private final Integer employeeId;
    private final String employeeName;

    public Employee(Integer employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }
}
