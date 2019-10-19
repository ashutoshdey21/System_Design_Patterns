package asu.ser.fse.facade.Subsystems;

import asu.ser.fse.facade.Entity.*;
import asu.ser.fse.facade.FacadeHACS;
import asu.ser.fse.facade.HACS_Interface;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String name = "Ashutosh", id = "hello123", password = "helloWorld";

        Person student=new Student(name, id, password);
        Person instructor=new Instructor(name, id, password);


        /*This demonstrates the Facade Pattern via implementing the Login functionality*/

        HACS_Interface facadeHACS=new FacadeHACS();
        /*Login for Student*/
        if (facadeHACS.login(student, student.getUserId(), student.getPassword()))
            System.out.println("Student Login Successful");
        else System.out.println("Student Login Failed");


        /*Login for Instructor*/
        if (facadeHACS.login(instructor, instructor.getUserId(), instructor.getPassword()))
            System.out.println("Instructor Login Successful");
        else System.out.println("Instructor Login Failed");



        /*This demonstrates the Bridge Pattern via implementing the Course functionality
        * Dive further for the Factory Pattern*/
        System.out.println("Showing the Course Menu for Student");
        facadeHACS.courseOperation(student);
        System.out.println("Showing the Course Menu for Instructor");
        facadeHACS.courseOperation(instructor);

        /*The Iterator Pattern*/

        System.out.println("The Courses added to the Course List using Course Iterator ");
        List<Course> courseList=new ArrayList<Course>();
        courseList.add(new Course("Course 550"));
        courseList.add(new Course("Course 480"));
        courseList.add(new Course("Course 340"));
        CourseIterator courseIterator =  new CourseIterator(courseList);
        while(courseIterator.hasNext()) {
            System.out.println(courseIterator.next().getCourseName());
        }

        System.out.println("The Solutions added to the Solution List using Solution Iterator ");
        List<Solution> solutionList=new ArrayList<Solution>();
        solutionList.add(new Solution("Solution 550"));
        solutionList.add(new Solution("Solution 480"));
        solutionList.add(new Solution("Solution 340"));
        SolutionIterator solutionIterator=new SolutionIterator(solutionList);
        while (solutionIterator.hasNext()){
            System.out.println(solutionIterator.next().getSolutionContent());
        }

        List<Person> personList= new ArrayList<Person>();
        personList.add(student);
        personList.add(instructor);
        /*facadeHACS.attachCourseToUser(courseList, personList);*/
        new FacadeHACS().accept(new ReminderVisitor());

















    }
}
