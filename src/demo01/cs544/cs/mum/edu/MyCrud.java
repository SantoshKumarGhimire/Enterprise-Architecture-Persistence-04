/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo01.cs544.cs.mum.edu;

/**
 *
 * @author Santosh
 */
public class MyCrud {
     public Boolean deleteStudent(int id) {
        Boolean delStatus = null;
        MyFirstPersister myPersister = new MyFirstPersister("Persistance04");
        myPersister.open("Persistance04");
        Student foundPerson = myPersister.findStudent(id);       
        if (foundPerson != null) {
            myPersister.delete(foundPerson);           
            delStatus = true;
        } else {
            delStatus = false;
        }
        return delStatus;

    }
}
