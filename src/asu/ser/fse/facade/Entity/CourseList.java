package asu.ser.fse.facade.Entity;

import asu.ser.fse.facade.FacadeHACS;
import asu.ser.fse.facade.Subsystems.Reminder;

import java.util.ArrayList;
import java.util.List;

public class CourseList extends ArrayList<Course> {
    Reminder reminder=new Reminder();
    List<Course> courseList;
    FacadeHACS facadeHACS;

    public void accept(NodeVisitor visitor){

        visitor.visitCourse(this);
    }

}
