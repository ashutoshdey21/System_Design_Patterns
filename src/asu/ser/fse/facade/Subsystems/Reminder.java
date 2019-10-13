package asu.ser.fse.facade.Subsystems;

import asu.ser.fse.facade.Entity.Assignment;
import asu.ser.fse.facade.Entity.User;
import asu.ser.fse.facade.FacadeHACS;

public class Reminder {

    FacadeHACS getFunctionality=new FacadeHACS();

    Assignment remind(User user){
        return getFunctionality.remind(user);
    }

}
