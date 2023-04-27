package com.occ.rev.rev_api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.occ.rev.rev_api.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
