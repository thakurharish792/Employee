package com.springboot.Employee.Service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.springboot.Employee.Entity.Employee;

@Service
public interface IEmployeeService {
	
   public List<Employee> getAllEmployee();
   public Employee addEmployee(Employee employee);
   public Employee getEmployeeById(int id);
   public Employee getEmployeePhone(int employeePhone);
   public Employee updateEmployeeById(Employee employee,int id);

   
}
  