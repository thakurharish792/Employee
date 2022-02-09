package com.springboot.Employee.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.Employee.Entity.Employee;
import com.springboot.Employee.Service.IEmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private IEmployeeService EmployeeService;

	
	// all employee show
	@GetMapping("/employee")
	public List<Employee> getAllEmployee()
	{
		return EmployeeService.getAllEmployee();
		
	}
	
	// by id show employee
	@GetMapping("/employee/{id}")
	public Employee getEmployeeById(@PathVariable int id)
	{

		return EmployeeService.getEmployeeById(id);
		
	}	
	
	//search by employeePhone
	@GetMapping("/emp/{employeePhone}")
	public Employee getEmployeePhone(@PathVariable int employeePhone)
	{
		return EmployeeService.getEmployeePhone(employeePhone);
		
	}

    // add employee to database	
	@PostMapping("/empl")
	public Employee addEmployee(@RequestBody Employee employee) 
	{
	         return  EmployeeService.addEmployee(employee);
		
	}
	
	
	// update employee detail
	@PutMapping("/employee/{id}")
	public Employee updateEmployeeById(@PathVariable int id ,@RequestBody Employee employee)
	{
		 return EmployeeService.updateEmployeeById(employee,id);
	
	}
	
	
}
