package asu.ser.fse.facade.Entity;

import asu.ser.fse.facade.FacadeHACS;
import asu.ser.fse.facade.Subsystems.Reminder;

public abstract class NodeVisitor {

    Reminder reminder=new Reminder();

    public abstract FacadeHACS visitFacade();
    public abstract Assignment visitAssignment(Assignment assignment);
    public abstract Course visitCourse(CourseList courses);


}
