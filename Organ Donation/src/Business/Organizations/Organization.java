/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organizations;

import Business.Employee.Employee;
import Business.Employee.EmployeeDirectory;

/**
 *
 * @author anujkumar
 */
public abstract class Organization{
    
    private int organizationID;
    private Employee employee;
    private String name;
    private EmployeeDirectory employeeDirectory;
    
    public Organization(String name){
        this.name=name;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }
    
    
}
