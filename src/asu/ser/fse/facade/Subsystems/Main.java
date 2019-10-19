package asu.ser.fse.facade.Subsystems;

import asu.ser.fse.facade.Entity.Instructor;
import asu.ser.fse.facade.Entity.Person;
import asu.ser.fse.facade.Entity.Student;
import asu.ser.fse.facade.FacadeHACS;
import asu.ser.fse.facade.HACS_Interface;

public class Main {

    public static void main(String[] args) {

        String name = "Ashutosh", id = "hello123", password = "helloWorld";

        Person student=new Student(name, id, password);
        Person instructor=new Instructor(name, id, password);


        /*This demonstrates the Facade Pattern via implementing the Login functionality*/

        FacadeHACS facadeHACS=new FacadeHACS();
        /*Login for Student*/
        if (facadeHACS.login(student, student.getUserId(), student.getPassword()))
            System.out.println("Student Login Successful");
        else System.out.println("Student Login Failed");


        /*Login for Instructor*/
        if (facadeHACS.login(instructor, instructor.getUserId(), instructor.getPassword()))
            System.out.println("Instructor Login Successful");
        else System.out.println("Instructor Login Failed");












    }
}
