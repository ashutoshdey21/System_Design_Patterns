package asu.ser.fse.facade.Subsystems;


import asu.ser.fse.facade.Entity.Person;
import asu.ser.fse.facade.FacadeHACS;
import asu.ser.fse.facade.HACS_Interface;

public class Login  {

    public boolean verifyLogin(Person person, String id, String password){

        System.out.println("You have reached the Login Class which is using Class:FacadeHACS Object:getFunctionality");
        if(id.length()>0 && password.length()>0)
            return true;
        else return false;
    }


}
