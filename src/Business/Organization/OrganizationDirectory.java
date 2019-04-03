/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author aman9
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type)
    {
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.WarehouseInventoryManager.getValue()))
        {
            organization = new WarehouseInventoryOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Organization.Type.WarehouseManager.getValue()))
        {
            organization = new WarehouseOrganization();
            organizationList.add(organization);
        }
        
        else if(type.getValue().equals(Organization.Type.SupplierManager.getValue()))
        {
            organization = new SupplierOrganization();
            organizationList.add(organization);
        }
        
        /*else if(type.getValue().equals(Organization.Type.InventoryManager.getValue()))
        {
            organization = new WarehouseInventoryOrganization();
            organizationList.add(organization);
                    
        }*/
        
        else if(type.getValue().equals(Organization.Type.DeliveryManager.getValue()))
        {
            organization = new DeliveryOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Organization.Type.StoreManager.getValue()))
        {
            organization = new StoreManagerOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Organization.Type.StoreInventory.getValue()))
        {
            organization = new StoreInventoryOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Organization.Type.Customer.getValue()))
        {
            organization = new CustomerOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
    
}
