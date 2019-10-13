package asu.ser.fse.facade.Subsystems;


import asu.ser.fse.facade.FacadeHACS;

public class Login  {

    FacadeHACS getFunctionality=new FacadeHACS();

    public Boolean verifyLogin(String id, String password){

        return getFunctionality.login(id, password);
    }


}
