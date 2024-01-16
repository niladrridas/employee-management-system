package com.yourcompany.employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDatabase {
    private List<Employee> employees;

    public EmployeeDatabase() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        // Add employee to the list
        this.employees.add(employee);
    }

    public List<Employee> getAllEmployees() {
        // Return the list of all employees
        return this.employees;
    }

    // Additional methods for updating, deleting, and querying employees
}
