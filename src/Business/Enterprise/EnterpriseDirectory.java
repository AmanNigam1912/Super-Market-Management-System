/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Network.City;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class EnterpriseDirectory 
{
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory()
    {
        this.enterpriseList = new ArrayList();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public Enterprise addEnterprise(String name, Enterprise.EnterpriseType type)
    {
        Enterprise enterprise= null;
        
        if( type == Enterprise.EnterpriseType.Warehouse )
        {
            enterprise = new WarehouseEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if( type == Enterprise.EnterpriseType.Store){
            enterprise = new StoreEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if (type == Enterprise.EnterpriseType.Supplier)
        {
        enterprise = new SupplierEnterprise(name);
        enterpriseList.add(enterprise);
        }
        else
        {
        enterprise = new CustomerEnterprise(name);
        enterpriseList.add(enterprise);
        }
        return enterprise;
        
    }
    
    public void removeEnterprise(Enterprise enterprise){
        enterpriseList.remove(enterprise);
        
    }
}
