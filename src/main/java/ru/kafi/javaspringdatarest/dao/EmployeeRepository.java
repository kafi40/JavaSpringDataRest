package ru.kafi.javaspringdatarest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kafi.javaspringdatarest.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
