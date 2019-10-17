package asu.ser.fse.facade.Entity;

import asu.ser.fse.facade.FacadeHACS;

public class ReminderVisitor extends NodeVisitor {


    @Override
    public FacadeHACS visitFacade() {
        return new FacadeHACS();
    }

    @Override
    public Assignment visitAssignment(Assignment assignment) {
        return new Assignment();
    }

    @Override
    public Course visitCourse(CourseList courses) {
        return new Course();
    }


}
