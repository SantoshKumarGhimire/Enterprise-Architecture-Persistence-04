package demo01.cs544.cs.mum.edu;

import demo01.cs544.cs.mum.edu.Notebook;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-22T21:54:16")
@StaticMetamodel(Student.class)
public class Student_ extends Person_ {

    public static volatile SingularAttribute<Student, Float> gpa;
    public static volatile ListAttribute<Student, Notebook> noteBook;

}