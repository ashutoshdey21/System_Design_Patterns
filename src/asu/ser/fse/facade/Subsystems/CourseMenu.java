package asu.ser.fse.facade.Subsystems;

import asu.ser.fse.facade.Entity.Course;
import asu.ser.fse.facade.Entity.Person;
import asu.ser.fse.facade.FacadeHACS;

import java.util.List;

public abstract class CourseMenu  {

    FacadeHACS getFunctionality=new FacadeHACS();
    Person person;

    public List<Course> createCourseList() {
        return getFunctionality.createCourseList();
    }

    public abstract void showAddButton();

    public abstract void showViewButton();

    public abstract void showRadioButton();

    public abstract void showLabels();

    void showMenu() {

    }



}
