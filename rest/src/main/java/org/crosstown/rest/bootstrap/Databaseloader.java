package org.crosstown.rest.bootstrap;

import org.crosstown.rest.domain.Employee;
import org.crosstown.rest.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author developer
 * @date 2018-12-13
 * @time 20:19
 */
@Component
public class Databaseloader implements CommandLineRunner {

    @Autowired
    private final EmployeeRepository employeeRepository;

    public Databaseloader(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        this.employeeRepository.save(new Employee("Carlos", "Torre", "good professor"));
        this.employeeRepository.save(new Employee("Julian", "Elchamani", "don't know who"));
        this.employeeRepository.save(new Employee("Raul", "Espinel", "ese mismo"));



    }
}
