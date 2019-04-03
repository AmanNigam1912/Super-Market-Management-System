/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Role.SystemAdminRole;
import Business.Employee.Employee;
import Business.UserAccount.UserAccount;

/**
 *
 * @author aman9
 */
public class ConfigureASystem {
    
    public static SuperMarket configure(){
    
        SuperMarket superMarket = SuperMarket.getInstance();
        
        Employee employee = superMarket.getEmployeeDirectory().createEmployee("TechInnovators");
        
        UserAccount user = superMarket.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        return superMarket;
    }
    
}
