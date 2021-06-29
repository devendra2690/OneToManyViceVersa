package com.jpa.hibernet.manytomany.ManyToOneAndOneToMany.entity;

import javax.persistence.*;

@Entity
@Table(name = "address_manytoOne")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String address1;

    @Column
    private String address2;

    @Column
    private String city;

    @Column
    private String zipcode;

    @Column
    private String state;

    @Column
    private String country;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    //In above name attribute, you can specify any name. It will be crated in above entity table and will store foriegn key
    // Not necessory primary key column name, you can choose any name
    private Employee employee;

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setCountry(String country) {
        this.country = country;

    }
    public Address() {
    }
}
