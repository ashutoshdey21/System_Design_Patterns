package asu.ser.fse.facade.Entity;

import asu.ser.fse.facade.Subsystems.CourseMenu;

public abstract class Person {

    protected String name;
    protected String id;
    protected String password;
    protected int userType;

    private CourseMenu theCourseMenu;
    Assignment assignment;

    public void showAddButton(){

        System.out.println();

    }
    public void showViewButton(){

    }

    public void showRadioButton(){

    }

    public void showLabels(){

    }

    public abstract void showMenu(CourseMenu theCourseMenu);

    public abstract String getName();

    public abstract String getUserId();

    public abstract String getPassword();

    public abstract int getUserType();

    public abstract CourseMenu CreateCourseMenu(int nCourseLevel);


    public CourseMenu getTheCourseMenu() {
        return theCourseMenu;
    }

    public void setTheCourseMenu(CourseMenu theCourseMenu) {
        this.theCourseMenu = theCourseMenu;
    }
}
