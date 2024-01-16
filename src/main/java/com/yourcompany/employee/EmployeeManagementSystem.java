package com.yourcompany.employee;

import java.util.List;
import java.util.Scanner;

public class EmployeeManagementSystem {
    private static EmployeeDatabase employeeDatabase = new EmployeeDatabase();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Employee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    viewAllEmployees();
                    break;
                case 3:
                    System.out.println("Exiting the system. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addEmployee() {
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee position: ");
        String position = scanner.nextLine();

        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();

        Employee employee = new Employee();
        employee.setName(name);
        employee.setPosition(position);
        employee.setSalary(salary);

        employeeDatabase.addEmployee(employee);

        System.out.println("Employee added successfully!\n");
    }

    private static void viewAllEmployees() {
        List<Employee> employees = employeeDatabase.getAllEmployees();

        if (employees.isEmpty()) {
            System.out.println("No employees found.\n");
        } else {
            System.out.println("All Employees:");
            for (Employee employee : employees) {
                System.out.println(employee);
            }
            System.out.println();
        }
    }
}
