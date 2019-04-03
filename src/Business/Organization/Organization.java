/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Customer.CustomerDirectory;
import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author aman9
 */
public abstract class Organization {
    
    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private CustomerDirectory custDir;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;

    public enum Type{
        Admin("Admin Organization"), WarehouseManager("Warehouse Manager Organization"), SupplierManager("Supplier Manager Organization"),WarehouseInventoryManager("Warehouse Inventory Manager Organization"),InventoryManager("Inventory Manager Organization"),DeliveryManager("Delivery Manager Organization"),StoreManager("Store Manager Organization"),StoreInventory("Store Inventory Org"),Customer("Customer");  

        private String value;
        private Type(String value) 
        {
            this.value = value;
        }
        public String getValue() 
        {
            return value;
        }
    }
    
    public Organization(String name) {
        this.name=name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        custDir = new CustomerDirectory();
        organizationID = counter;
        ++counter;
    }
    
    public abstract ArrayList<Role> getSupportedRole();
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }
    
    //getter and setters of work Queue

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public CustomerDirectory getCustDir() {
        return custDir;
    }

    public void setCustDir(CustomerDirectory custDir) {
        this.custDir = custDir;
    }
    
    
    
    
    @Override
    public String toString() {
        return name;
    }
}
