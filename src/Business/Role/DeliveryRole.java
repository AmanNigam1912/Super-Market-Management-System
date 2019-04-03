/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.Organization.CustomerOrganization;
import Business.Organization.DeliveryOrganization;
import Business.Organization.Organization;
import Business.SuperMarket;
import Business.UserAccount.UserAccount;
import UserInterface.DeliveryRole.IncomingDeliveries;
import javax.swing.JPanel;

/**
 *
 * @author aman9
 */
public class DeliveryRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel rightPanel, UserAccount account, Organization organization, Enterprise enterprise, SuperMarket supermarket) 
    {
        return new IncomingDeliveries(rightPanel,account, (DeliveryOrganization)organization,enterprise);
    }
}
