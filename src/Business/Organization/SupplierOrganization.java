  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SupplierManagerRole;
import Business.Supplier.SupplierDirectory;
import java.util.ArrayList;

/**
 *
 * @author aman9
 */
public class SupplierOrganization extends Organization {
    
//    private SupplierDirectory supplierDirectory;
    
    public SupplierOrganization() {
        super(Organization.Type.SupplierManager.getValue());
//        supplierDirectory= new SupplierDirectory();
        
    }

//    public SupplierDirectory getSupplierDirectory() {
//        return supplierDirectory;
//    }
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SupplierManagerRole());
        return roles;
    }
}
