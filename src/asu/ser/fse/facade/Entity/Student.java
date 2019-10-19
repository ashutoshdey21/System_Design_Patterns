package asu.ser.fse.facade.Entity;

public class Student extends Person {


    @Override
    void showMenu() {



    }

    @Override
    void CreateCourseMenu() {

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


}
