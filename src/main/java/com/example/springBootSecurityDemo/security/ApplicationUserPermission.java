package com.example.springBootSecurityDemo.security;

public enum ApplicationUserPermission {
    EMPLOYEE_READ("employee: read"),
    EMPLOYEE_WRITE("employee: write"),
    PROJECT_READ("project: read"),
    PROJECT_WRITE("project: write");

    private String permission;

    ApplicationUserPermission(String permission){
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission){
        this.permission = permission;
    }

 }
