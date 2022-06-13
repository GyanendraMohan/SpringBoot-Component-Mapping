package com.gyanendra.componentmapping.repos;

import com.gyanendra.componentmapping.entities.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}
