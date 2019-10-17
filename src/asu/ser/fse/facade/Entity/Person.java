package asu.ser.fse.facade.Entity;

import asu.ser.fse.facade.FacadeHACS;
import asu.ser.fse.facade.Subsystems.CourseMenu;

public abstract class Person {


    private CourseMenu theCourseMenu;
    Assignment assignment;

    public void showAddButton(){

    }
    public void showViewButton(){

    }

    public void showRadioButton(){

    }

    public void showLabels(){

    }

    abstract void showMenu();

    abstract void CreateCourseMenu();







}
