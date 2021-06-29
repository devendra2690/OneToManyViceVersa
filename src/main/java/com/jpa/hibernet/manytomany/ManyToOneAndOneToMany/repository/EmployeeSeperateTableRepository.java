package com.jpa.hibernet.manytomany.ManyToOneAndOneToMany.repository;

import com.jpa.hibernet.manytomany.ManyToOneAndOneToMany.entity.Employee;
import com.jpa.hibernet.manytomany.ManyToOneAndOneToMany.entity.seperatetable.EmployeeSeperateTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeSeperateTableRepository extends JpaRepository<EmployeeSeperateTable,Long> {
}
