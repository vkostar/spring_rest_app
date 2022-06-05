package com.kostar.spring.rest.dao;


import com.kostar.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeDao {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    public void deleteEmployee(int id);

}

