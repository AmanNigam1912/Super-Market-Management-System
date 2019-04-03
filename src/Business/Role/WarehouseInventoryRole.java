/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.WarehouseInventoryOrganization;
import Business.SuperMarket;
import Business.UserAccount.UserAccount;
import UserInterface.WarehouseInventory.WarehouseInventoryJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Administrator
 */
public class WarehouseInventoryRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel rightJPanel, UserAccount account, Organization organization, Enterprise enterprise, SuperMarket supermarket) {
        return new WarehouseInventoryJPanel(rightJPanel, account, (WarehouseInventoryOrganization)organization, enterprise);
    }
}
