/**
 * 
 */
package com.java.security.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.java.security.model.EmployeeModel;
import com.java.security.pojo.Employee;

/**
 * @author Ranjan
 *
 */
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeModel, Long>{
@Query("select employee from EmployeeModel employee ")
public List<EmployeeModel> findEmployees();	
	
}
