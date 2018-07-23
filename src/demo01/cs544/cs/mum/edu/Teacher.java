/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo01.cs544.cs.mum.edu;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author $Santosh
 */


@Entity

@PrimaryKeyJoinColumn(name="Person_Id")
public class Teacher extends Person {

    private float salary;
    @OneToOne(cascade = CascadeType.ALL)
    private Laptop laptop;

    public Teacher() {
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

}
