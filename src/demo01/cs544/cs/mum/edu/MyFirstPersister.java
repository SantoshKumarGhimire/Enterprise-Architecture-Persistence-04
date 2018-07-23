package demo01.cs544.cs.mum.edu;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author $Santosh
 */
public class MyFirstPersister {

    private EntityManagerFactory emf;
    private EntityManager em;

    public MyFirstPersister(String Persistance04) {
        init(Persistance04);
    }

    public void init(String Persistance04) {
        emf = Persistence.createEntityManagerFactory(Persistance04);
        em = emf.createEntityManager();
    }

    public void open(String Persistance04) {
        if (emf == null) {
            init(Persistance04);

        }
    }

    public <T> void persist(T t) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(t);
        tx.commit();
    }

    public Person find(int id) {
       Person s = em.find(Person.class, id);        
        System.out.println("Found  Person=> "+s.getName());
        return s;
    }
    
    public Student findStudent(int id) {
       Student student = em.find(Student.class, id);        
        System.out.println("Found Student=> "+student.getName()+" =>"+ student.getNoteBook().size());
        return student;
    }
    

    public <T>void delete(T t) {
         if (t != null) {
            em.getTransaction().begin();
            em.remove(t);
            em.getTransaction().commit();
        }

    }

    public void close() {

        if (emf != null) {
            em.close();
            emf.close();
            emf = null;
        }
    }
}
