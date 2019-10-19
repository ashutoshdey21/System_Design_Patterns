package asu.ser.fse.facade.Entity;

import asu.ser.fse.facade.FacadeHACS;
import asu.ser.fse.facade.Subsystems.Reminder;

public abstract class NodeVisitor {

    Reminder reminder=new Reminder();

    public abstract void visitFacade(FacadeHACS facadeHACS);
    public abstract void visitAssignment(Assignment assignment);
    public abstract void visitCourse(CourseList courses);


}
