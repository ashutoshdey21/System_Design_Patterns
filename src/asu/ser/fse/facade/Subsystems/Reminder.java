package asu.ser.fse.facade.Subsystems;

import asu.ser.fse.facade.Entity.Assignment;
import asu.ser.fse.facade.Entity.NodeVisitor;
import asu.ser.fse.facade.Entity.Person;
import asu.ser.fse.facade.FacadeHACS;

public class Reminder {

    FacadeHACS getFunctionality = new FacadeHACS();

    Assignment remind(Person person) {
        return getFunctionality.remind(person);
    }

    NodeVisitor nodeVisitor;

}
