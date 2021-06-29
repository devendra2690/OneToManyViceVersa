package com.jpa.hibernet.manytomany.ManyToOneAndOneToMany.controller;

import com.jpa.hibernet.manytomany.ManyToOneAndOneToMany.entity.Address;
import com.jpa.hibernet.manytomany.ManyToOneAndOneToMany.entity.Employee;
import com.jpa.hibernet.manytomany.ManyToOneAndOneToMany.entity.seperatetable.AddressSeperateTable;
import com.jpa.hibernet.manytomany.ManyToOneAndOneToMany.entity.seperatetable.EmployeeSeperateTable;
import com.jpa.hibernet.manytomany.ManyToOneAndOneToMany.repository.EmployeeRepository;
import com.jpa.hibernet.manytomany.ManyToOneAndOneToMany.repository.EmployeeSeperateTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

  @Autowired
  EmployeeRepository employeeRepository;

  @Autowired
  EmployeeSeperateTableRepository employeeSeperateTableRepository;

  @PostMapping("/onetomany/add")
  public Employee addEmployee(@RequestBody Employee employee) {

      List<Address> addressList = employee.getAddress().stream().map(obj->{
          obj.setEmployee(employee);
          return obj;
      }).collect(Collectors.toList());

      employee.getAddress().clear();
      employee.setAddress(addressList);

      employeeRepository.save(employee);
      return employee;
  }

  @DeleteMapping("/onetomany/delete/{id}")
  public String deleteEmployee(@PathVariable("id")Long id) {

      employeeRepository.deleteById(id);
      return "Deleted Employee :"+id;
  }


    @PostMapping("/onetomany/seperatetable/add")
    public EmployeeSeperateTable addEmployeeSeperateTable(@RequestBody EmployeeSeperateTable employee) {

        List<AddressSeperateTable> addressList = employee.getAddress().stream().map(obj->{
            obj.setEmployee(employee);
            return obj;
        }).collect(Collectors.toList());

        employee.getAddress().clear();
        employee.setAddress(addressList);

        employeeSeperateTableRepository.save(employee);
        return employee;
    }

    @DeleteMapping("/onetomany/seperatetable/delete/{id}")
    public String deleteEmployeeSeperateTable(@PathVariable("id")Long id) {

        employeeSeperateTableRepository.deleteById(id);
        return "Deleted Employee :"+id;
    }
}
