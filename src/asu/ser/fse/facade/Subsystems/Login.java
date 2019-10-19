package asu.ser.fse.facade.Subsystems;


import asu.ser.fse.facade.Entity.Person;
import asu.ser.fse.facade.FacadeHACS;

public class Login  {

    FacadeHACS getFunctionality=new FacadeHACS();

    public boolean verifyLogin(Person person, String id, String password){

        System.out.println("You have reached the Login Class which is using Class:FacadeHACS Object:getFunctionality");
        return getFunctionality.login(person, id, password);
    }


}
