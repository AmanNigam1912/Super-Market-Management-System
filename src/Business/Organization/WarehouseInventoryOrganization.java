/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.WarehouseInventoryRole;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class WarehouseInventoryOrganization extends Organization {
     public WarehouseInventoryOrganization() {
        super(Organization.Type.WarehouseInventoryManager.getValue());
        
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new WarehouseInventoryRole() );
        return roles;
    }
}
