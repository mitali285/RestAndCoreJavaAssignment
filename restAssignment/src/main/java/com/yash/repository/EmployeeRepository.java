/**
 * 
 */
package com.yash.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.model.Employee;

/**
 * @author Mitali
 *
 */
@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Long> {

	/**
	 * @param empid
	 * @return
	 */
	// Employee findOne(Long empid);

}
