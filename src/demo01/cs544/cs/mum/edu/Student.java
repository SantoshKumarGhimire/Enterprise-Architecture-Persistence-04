/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo01.cs544.cs.mum.edu;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author $Santosh
 */

@Entity
@PrimaryKeyJoinColumn(name = "Person_Id")
public class Student extends Person {

    private float gpa;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Notebook> noteBook = new ArrayList<Notebook>();

    public Student() {
    }

    public List<Notebook> getNoteBook() {
        return noteBook;
    }

    public void setNoteBook(List<Notebook> noteBook) {
        this.noteBook = noteBook;
    }

    public Float getGpa() {
        return gpa;
    }

    public void setGpa(Float gpa) {
        this.gpa = gpa;
    }

    public void addNOteBooks(Notebook noteBookpassed) {
        noteBook.add(noteBookpassed);
    }

}
