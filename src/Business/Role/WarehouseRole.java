/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.WarehouseOrganization;
import Business.SuperMarket;
import Business.UserAccount.UserAccount;
import UserInterface.WarehouseRole.WarehouseJPanel;
import javax.swing.JPanel;

/**
 *
 * @author ADMIN
 */
public class WarehouseRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel rightJPanel, UserAccount account, Organization organization, Enterprise enterprise, SuperMarket supermarket) {
        return new WarehouseJPanel(rightJPanel, account, (WarehouseOrganization)organization, enterprise,supermarket);
    }
}
