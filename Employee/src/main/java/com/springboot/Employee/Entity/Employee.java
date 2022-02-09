package com.springboot.Employee.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	private int employeePhone;
	private String employeeName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEmployeePhone() {
		return employeePhone;
	}
	public void setEmployeePhone(int employeePhone) {
		this.employeePhone = employeePhone;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Employee(int id, int employeePhone, String employeeName) {
		super();
		this.id = id;
		this.employeePhone = employeePhone;
		this.employeeName = employeeName;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeePhone=" + employeePhone + ", employeeName=" + employeeName + "]";
	}
	
}