/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.SupplierOrganization;
import Business.SuperMarket;
import Business.UserAccount.UserAccount;
import UserInterface.SupplierRole.SupplierLoginJPanel;
import UserInterface.SupplierManagerRole.SupplierManageJPanel;

import javax.swing.JPanel;

/**
 *
 * @author aman9
 */
public class SupplierManagerRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel rightJPanel, UserAccount account, Organization organization, Enterprise enterprise, SuperMarket supermarket) 
    {
        return new SupplierManageJPanel(rightJPanel, account, (SupplierOrganization)organization, enterprise);
    }
}
