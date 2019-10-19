package asu.ser.fse.facade.Entity;

public class Instructor extends Person {

    @Override
    public void showAddButton() {

    }

    @Override
    public void showViewButton() {

    }

    @Override
    public void showRadioButton() {

    }

    @Override
    public void showLabels() {

    }

    @Override
    void showMenu() {

    }

    @Override
    public String getName() {

        return this.name;
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

        userType=1;
        return this.userType;
    }

    public Instructor(String name, String id, String password) {
        this.id=id;
        this.name=name;
        this.password=password;
    }

    @Override
    void CreateCourseMenu() {

    }


}
