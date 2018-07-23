/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo01_entities;

import demo01.cs544.cs.mum.edu.Laptop;
import demo01.cs544.cs.mum.edu.MyCrud;
import demo01.cs544.cs.mum.edu.MyFirstPersister;
import demo01.cs544.cs.mum.edu.Notebook;
import demo01.cs544.cs.mum.edu.Person;
import demo01.cs544.cs.mum.edu.Student;
import demo01.cs544.cs.mum.edu.Teacher;

/**
 *
 * @author $Santosh
 */
public class Demo01_Entities {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Notebook b1 = new Notebook(100);
        Notebook b2 = new Notebook(120);
        Notebook b3 = new Notebook(60);
        Notebook b4 = new Notebook(200);
        Notebook b5 = new Notebook(50);
        Notebook b6 = new Notebook(300);

        Student jack = new Student();
        jack.setName("jack");
        jack.setGpa(3.4F);
        jack.addNOteBooks(b1);
        jack.addNOteBooks(b2);
        jack.addNOteBooks(b3);

        Student john = new Student();
        john.setName("john");
        john.setGpa(3.2F);
        john.addNOteBooks(b4);
        john.addNOteBooks(b5);

        Student jill = new Student();
        jill.setGpa(3.6F);
        jill.setName("jill");
        jill.addNOteBooks(b6);

        Laptop l1 = new Laptop("dell");
        Teacher jim = new Teacher();
        jim.setName("jim");
        jim.setSalary(45000F);
        jim.setLaptop(l1);

        Laptop l2 = new Laptop("mac");
        Teacher jasmin = new Teacher();
        jasmin.setName("jasmine");
        jasmin.setSalary(46000F);
        jasmin.setLaptop(l2);

        MyFirstPersister myPersister = new MyFirstPersister("Persistance04");
        myPersister.open("Persistance04");

        myPersister.<Student>persist(jack);
        myPersister.<Student>persist(john);
        myPersister.<Student>persist(jill);
        myPersister.<Teacher>persist(jim);
        myPersister.<Teacher>persist(jasmin);

        Person personFound = myPersister.find(1);
        Student findStudent = myPersister.findStudent(1);
        MyCrud myCrud = new MyCrud();
        Boolean status = myCrud.deleteStudent(1);
        if (status == true) {
            System.out.println("Successfully Deleted");
        } else {
            System.out.println("Could not Delete");
        }

        myPersister.close();

    }
}
