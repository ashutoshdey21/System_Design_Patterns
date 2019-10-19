package asu.ser.fse.facade.Entity;

import asu.ser.fse.facade.FacadeHACS;
import asu.ser.fse.facade.HACS_Interface;
import asu.ser.fse.facade.Subsystems.CourseMenu;

import java.util.List;

public class ReminderVisitor extends NodeVisitor {


    HACS_Interface facadeHACS;
    @Override
    public void visitFacade(FacadeHACS facadeHACS) {

        System.out.println("Inside visitFacade for the Person");
        this.facadeHACS=facadeHACS;
        visitCourse(facadeHACS.courseList);

    }

    /**/
    @Override
    public void visitAssignment(Assignment assignment) {
        System.out.println("Inside visitAssignment: visit for each Person");

    }

    @Override
    public void visitCourse(CourseList courses) {
        System.out.println("Inside visitCourse: visit for each Person");
        /*List<Course> courseList=facadeHACS.thePerson.courseList;
        for (Course course: courseList){
            System.out.println(course.getCourseName());
        }

        visitAssignment(new Assignment());*/
    }


}
