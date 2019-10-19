package asu.ser.fse.facade;



import asu.ser.fse.facade.Entity.Assignment;
import asu.ser.fse.facade.Entity.Course;
import asu.ser.fse.facade.Entity.Solution;
import asu.ser.fse.facade.Entity.Person;

import java.util.List;

public interface HACS_Interface {

    int UserType = 0;
    Course theSelectedCourse = new Course();
    int nCourseLevel = 0;
    List<Course> theCourseList = null;
    Person thePerson = null;

    boolean login(Person person, String id, String password);
    abstract Assignment addAssignment(Person thePerson, Course course);
    String gradeSolution(Solution solution);
    void reportSolution(String grade);
    boolean submitSolution(Solution solution);
    Assignment remind(Person person);
    void createUser(Person person);
    List<Course> createCourseList();
    void attachCourseToUser(List<Course> courseList);
    Course SelectCourse(List<Course> courseList);
    void courseOperation(Person person);



    
}
