package com.question;

import org.springframework.context.annotation.Bean;

public class AppConfig {

    @Bean("employee")
    public Employee getEmployeeDetails(){
        Employee employee = new Employee();
        employee.setEmpId(101);
        employee.setEmpName("Thomas Shelby");
        employee.setSalary(50000.50);
        return employee;
    }

    @Bean
    public Department getDepartmentDetails(){
        return new Department(1,"Investigation");
    }
}
