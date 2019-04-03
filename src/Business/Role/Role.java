/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.SuperMarket;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author aman9
 */
public abstract class Role {

    //int enterpriseType;      
    public enum RoleType{
        WarehouseManager("Warehouse Manager"),
        SupplierManager("Supplier Manager"),
        WarehouseInventoryManager("Warehouse Inventory Manager"),
        StoreManager("Store Manager"),
        InventoryManager("Store Inventory Manager"),
        Customer("Customer"),
        DeliveryManager("Delivery Manager");
        
        
   private String value;

        private RoleType(String value ) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
                
        @Override
        public String toString() {
            return value;
        }
        
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            SuperMarket superMarket);
//            ,            String selectedRow);
   
   @Override
    public String toString() {
        return this.getClass().getName();
    }
}
