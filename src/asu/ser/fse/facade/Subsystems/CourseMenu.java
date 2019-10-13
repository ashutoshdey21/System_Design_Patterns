package asu.ser.fse.facade.Subsystems;

import asu.ser.fse.facade.Entity.Course;
import asu.ser.fse.facade.FacadeHACS;

import java.util.List;

public class CourseMenu {

    FacadeHACS getFunctionality=new FacadeHACS();

    public List<Course> createCourseList() {
        return getFunctionality.createCourseList();
    }



}
