package asu.ser.fse.facade.Entity;

import asu.ser.fse.facade.Subsystems.CourseMenu;
import asu.ser.fse.facade.Subsystems.HighLevelCourseMenu;
import asu.ser.fse.facade.Subsystems.LowLevelCourseMenu;

public class Student extends Person {


    @Override
    public void showMenu(CourseMenu theCourseMenu) {

        theCourseMenu.showViewButton();
        theCourseMenu.showAddButton();
        theCourseMenu.showRadioButton();
        theCourseMenu.showLabels();

    }

    @Override
    public String getName() {

        return this.name;
    }

    public Student(String name, String id, String password) {
        this.id=id;
        this.name=name;
        this.password=password;
    }

    @Override
    public String getUserId() {

        return this.id;
    }

    @Override
    public String getPassword() {

        return this.password;
    }

    @Override
    public int getUserType() {

        userType=0;
        return this.userType;
    }

    /*This demonstrates the Factory Pattern via implementing the CreateCourseMenu functionality*/
    @Override
    public CourseMenu CreateCourseMenu(int nCourseLevel) {

        if(nCourseLevel==0) return new LowLevelCourseMenu();
        else return new HighLevelCourseMenu();

    }


}
