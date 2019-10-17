package asu.ser.fse.facade.Entity;

import asu.ser.fse.facade.Subsystems.Reminder;

public class Assignment {
    Reminder reminder=new Reminder();


    public void accept(NodeVisitor visitor){
        visitor.visitAssignment(this);
    }
}
