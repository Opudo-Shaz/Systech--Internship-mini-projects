package com.example.optional;

import java.lang.StackWalker.Option;
import java.util.Map;
import java.util.Optional;

import org.springframework.boot.autoconfigure.data.rest.RepositoryRestProperties;

public class EmployeeRepository extends Repository<Employee, Long> {

    Map<Long, Employee> emplMap = Map.of(
        1L, new Employee(1L, "Alice", new Department()),
        2L, new Employee(2L, "Bob", new Department()),
        3L, new Employee(3L, "Charlie", new Department())
    );

    public Optional<Employee> findById(Long id) {
        Employee employee = emplMap.get(id);
        System.out.println("Finding employee by ID: " + id);
        return Optional.ofNullable(employee);
    }

    public Optional<Employee> findByName(String name) {
        return emplMap.values().stream()
            .filter(emp -> emp.getName().equals(name))
            .findFirst();
    }

    
}
