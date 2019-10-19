package asu.ser.fse.facade.Subsystems;

import asu.ser.fse.facade.Entity.Instructor;
import asu.ser.fse.facade.Entity.Person;
import asu.ser.fse.facade.Entity.Student;

public class HighLevelCourseMenu extends CourseMenu {

    Student student;
    Instructor instructor;
    @Override
    public void showAddButton() {
        System.out.println("This the High Level showAddButton");
    }

    @Override
    public void showViewButton() {
        System.out.println("This the High Level showViewButton");
    }

    @Override
    public void showRadioButton() {
        System.out.println("This the High Level showRadioButton");
    }

    @Override
    public void showLabels() {

        System.out.println("This the High Level showLabels");
    }

    @Override
    void showMenu() {

        System.out.println("This the High Level Course Menu");

    }
}
