package asu.ser.fse.facade;

import asu.ser.fse.facade.Entity.Assignment;
import asu.ser.fse.facade.Entity.Course;
import asu.ser.fse.facade.Entity.Solution;
import asu.ser.fse.facade.Entity.User;

import java.util.List;

public class FacadeHACS implements HACS_Interface {
    @Override
    public boolean login(String id, String password) {
        return false;
    }

    @Override
    public Assignment addAssignment(User thePerson) {
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
    public Assignment remind(User user) {
        return null;
    }

    @Override
    public void createUser(User user) {

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

    @Override
    public void courseOperation(User user) {

    }
}
