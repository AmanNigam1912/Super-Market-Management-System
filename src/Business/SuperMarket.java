/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Network.City;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author aman9
 */
public class SuperMarket extends Organization{
    
    private static SuperMarket superMarket;
    private ArrayList<City> cityList;
    public static SuperMarket getInstance(){
        if(superMarket==null){
            superMarket=new SuperMarket();
        }
        return superMarket;
    }
    private SuperMarket(){
        super(null);
        cityList=new ArrayList<City>();
    }
    
    public City createAndAddCity(){
        City city=new City();
        cityList.add(city);
        return city;
    }
    
    public void removeCity(City city){
        cityList.remove(city);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public ArrayList<City> getCityList() {
        return cityList;
    }

    public void setCityList(ArrayList<City> cityList) {
        this.cityList = cityList;
    }
    
    //checkIfUserIsUnique method yet to be implemented
    public boolean checkIfUserIsUnique(String userName)
    {
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(City city:cityList){
            
        }
        return true;
    }
}
