package asu.ser.fse.facade;

import asu.ser.fse.facade.Entity.Assignment;
import asu.ser.fse.facade.Entity.Course;
import asu.ser.fse.facade.Entity.Person;
import asu.ser.fse.facade.Entity.Solution;
import asu.ser.fse.facade.Subsystems.Login;

import java.util.List;

public class FacadeHACS implements HACS_Interface {


    @Override
    public boolean login(Person person, String id, String password) {

        System.out.println("You have reached the Login method of FacadeHACS implements HACS_Interface.");
        return new Login().verifyLogin(person, id, password);


    }

    @Override
    public Assignment addAssignment(Person thePerson, Course course) {
        return null;
    }

    @Override
    public String gradeSolution(Solution solution) {
        return null;
    }

    @Override
    public void reportSolution(String grade) {

    }

    @Override
    public boolean submitSolution(Solution solution) {
        return false;
    }

    @Override
    public Assignment remind(Person person) {
        return null;
    }

    @Override
    public void createUser(Person person) {

    }

    @Override
    public List<Course> createCourseList() {
        return null;
    }

    @Override
    public void attachCourseToUser(List<Course> courseList) {

    }

    @Override
    public Course SelectCourse(List<Course> courseList) {
        return null;
    }

    /*Dive further for the Factory Pattern*/
    @Override
    public void courseOperation(Person person) {

        System.out.println("Starting Course Operation");
        System.out.println("Showing the High Level Menu");
        person.setTheCourseMenu(person.CreateCourseMenu(1));

        System.out.println("Showing the Low Level Menu");
        person.setTheCourseMenu(person.CreateCourseMenu(0));

        person.showMenu(person.getTheCourseMenu());


    }

}
