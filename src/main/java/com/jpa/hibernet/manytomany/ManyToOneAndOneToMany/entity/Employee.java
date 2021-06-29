package com.jpa.hibernet.manytomany.ManyToOneAndOneToMany.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "employee_onetomany")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private long id;

    @Column
    private String name;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    // if i remove mappedBy then all-together different table will be created to maintain relation. See Other Entity example
    private List<Address> address;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }
}
