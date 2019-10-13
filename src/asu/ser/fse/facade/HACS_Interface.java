package asu.ser.fse.facade;



import asu.ser.fse.facade.Entity.Assignment;
import asu.ser.fse.facade.Entity.Course;
import asu.ser.fse.facade.Entity.Solution;
import asu.ser.fse.facade.Entity.User;

import java.util.List;

public interface HACS_Interface {

    int UserType = 0;
    Course theSelectedCourse = new Course();
    int nCourseLevel = 0;
    List<Course> theCourseList = null;
    User thePerson = null;

    boolean login(String id, String password);
    abstract Assignment addAssignment(User thePerson);
    String gradeSolution(Solution solution);
    void reportSolution(String grade);
    boolean submitSolution(Solution solution);
    Assignment remind(User user);
    void createUser(User user);
    List<Course> createCourseList();
    void attachCourseToUser(List<Course> courseList);
    Course SelectCourse(List<Course> courseList);
    void courseOperation(User user);



    
}
