package com.springboot.Employee.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.Employee.Entity.Employee;
import com.springboot.Employee.Repository.IEmployeeRepository;

@Service
public class ImplEmployeeService implements IEmployeeService {
	
	@Autowired IEmployeeRepository EmployeeRepository;

	@Override
	public List<Employee> getAllEmployee() 
	{
		 return  (List<Employee>) EmployeeRepository.findAll();
		
	}
	
	@Override
	public Employee addEmployee(Employee employee) 
	{
		return EmployeeRepository.save(employee);

	}
	
	@Override
	public Employee updateEmployeeById(Employee employee, int id) {
		
		return EmployeeRepository.save(employee);
	}
	
	

	@Override
	public Employee getEmployeeById(int id)
	{
		return EmployeeRepository.findById(id).orElse(null);
		
	}

	@Override
	public Employee getEmployeePhone(int employeePhone) {
		
		return EmployeeRepository.findById(employeePhone).orElse(null);
	}



	
}
