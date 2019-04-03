/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;

/**
 *
 * @author aman9
 */
public class City {
    
    private String CityName;
    private EnterpriseDirectory enterpriseDirectory;

    public City() 
    {
        enterpriseDirectory = new EnterpriseDirectory();
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String CityName) {
        this.CityName = CityName;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }
    
    //Overide toString()
    @Override
    public String toString(){
        return CityName;
    }
    
}
