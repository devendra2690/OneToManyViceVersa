package com.jpa.hibernet.manytomany.ManyToOneAndOneToMany.repository;

import com.jpa.hibernet.manytomany.ManyToOneAndOneToMany.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
