package org.crosstown.rest.repositories;

import org.crosstown.rest.domain.Employee;
import org.springframework.data.repository.CrudRepository;

/**
 * @author developer
 * @date 2018-12-13
 * @time 20:17
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
