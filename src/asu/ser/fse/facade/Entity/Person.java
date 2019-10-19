package asu.ser.fse.facade.Entity;

import asu.ser.fse.facade.FacadeHACS;
import asu.ser.fse.facade.Subsystems.CourseMenu;

public abstract class Person {

    protected String name;
    protected String id;
    protected String password;
    protected int userType;

    private CourseMenu theCourseMenu;
    Assignment assignment;

    public abstract void showAddButton();
    public abstract void showViewButton();

    public abstract void showRadioButton();

    public abstract void showLabels();

    abstract void showMenu();

    public abstract String getName();

    public abstract String getUserId();

    public abstract String getPassword();

    public abstract int getUserType();

    abstract void CreateCourseMenu();








}
