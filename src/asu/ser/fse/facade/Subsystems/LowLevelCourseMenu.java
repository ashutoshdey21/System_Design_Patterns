package asu.ser.fse.facade.Subsystems;

import asu.ser.fse.facade.Entity.Instructor;
import asu.ser.fse.facade.Entity.Student;

public class LowLevelCourseMenu extends CourseMenu {

    Student student;
    Instructor instructor;
    @Override
    public void showAddButton() {
        System.out.println("This the Low Level showAddButton");
    }

    @Override
    public void showViewButton() {
        System.out.println("This the Low Level showViewButton");
    }

    @Override
    public void showRadioButton() {
        System.out.println("This the Low Level showRadioButton");
    }

    @Override
    public void showLabels() {
        System.out.println("This the Low Level showLabels");
    }

    @Override
    void showMenu() {
        System.out.println("This the Low Level Course Menu");
    }
}
