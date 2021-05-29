package com.onlinebank.ib;

public interface EmployeeOperations {

    void insertEmployee(Employee e);
    void removeEmployee(Employee e);
    Employee getEmployee(int empId);
    void showAllEmployees();
}