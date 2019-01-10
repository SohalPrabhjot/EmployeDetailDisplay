package org.EmployeWorld.model;

import javax.persistence.*;


@Entity
@Table(name="employe",schema ="public")
public class Employe {

    @Id
    @Column(name= "id")
    private Long id;

    @Column(name= "name")
    private String name;

    @Column(name= "address")
    private String address;

    @Column(name=" salary")
    private String salary;


    @Column(name= "age")
    private String age;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }


    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
