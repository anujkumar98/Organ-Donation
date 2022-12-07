/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author anujkumar
 */
public class EmployeeDirectory {
    private ArrayList<Employee> employeeList;
    
    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
public Employee createEmployee(String name,String password,String enterprise){
        Employee employee = new Employee();
        employee.setUsername(name);
        employee.setPassword(password);
        employee.setEnterprise(enterprise);
        employeeList.add(employee);
        return employee;
    }
    //Adding employee details to list 
public ArrayList<Employee> add(Employee e){
        employeeList.add(e);
        return employeeList;
    }
}
