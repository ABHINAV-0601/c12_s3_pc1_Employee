package com.question;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
    private int empId;
    private String empName;
    private double salary;
    @Autowired
    private Department department;

    public Employee() {
    }

    public Employee(int empId, String empName, double salary, Department department) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.department = department;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                ", department=" + department +
                '}';
    }
}
