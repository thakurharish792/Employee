package com.springboot.Employee.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.Employee.Entity.Employee;

@Repository
public interface IEmployeeRepository  extends CrudRepository<Employee, Integer>{

}
