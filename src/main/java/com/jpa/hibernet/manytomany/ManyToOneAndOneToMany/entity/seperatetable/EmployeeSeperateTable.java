package com.jpa.hibernet.manytomany.ManyToOneAndOneToMany.entity.seperatetable;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "employee_seperatetable")
public class EmployeeSeperateTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    // if i remove mappedBy then all-together different table will be created to maintain relation.
    private List<AddressSeperateTable> address;

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

    public List<AddressSeperateTable> getAddress() {
        return address;
    }

    public void setAddress(List<AddressSeperateTable> address) {
        this.address = address;
    }
}
