package asu.ser.fse.facade.Subsystems;

import asu.ser.fse.facade.Entity.Instructor;
import asu.ser.fse.facade.Entity.Person;
import asu.ser.fse.facade.Entity.Student;

public class Main {

    public static void main(String[] args) {

        String name = "Ashutosh", id = "hello123", password = "helloWorld";

        Person student=new Student(name, id, password);
        Person instructor=new Instructor(name, id, password);


        /*This demonstrates the Facade Pattern via implementing the Login functionality*/
        Login login=new Login();
        /*Login for Student*/
        if (login.verifyLogin(student, student.getUserId(), student.getPassword()))
            System.out.println("Student Login Successful");
        else System.out.println("Student Login Failed");

        /*Login for Instructor*/
        if (login.verifyLogin(instructor, instructor.getUserId(), instructor.getPassword()))
            System.out.println("Instructor Login Successful");
        else System.out.println("Instructor Login Failed");










    }
}
