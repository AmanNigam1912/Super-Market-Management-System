/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Customer.CustomerDirectory;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Product.ProductDirectory;
import Business.Supplier.SupplierDirectory;

/**
 *
 * @author aman9
 */
public abstract class Enterprise extends Organization{
        
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    //private EnterpriseDirectory enterpriseDirectory;
    private SupplierDirectory supplierDirectory;
    private ProductDirectory prodDir;
    private CustomerDirectory custDir;
    
    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public SupplierDirectory getSupplierDirectory() {
        return supplierDirectory;
    }

    public ProductDirectory getProdDir() {
        return prodDir;
    }

    public CustomerDirectory getCustDir() {
        return custDir;
    }
    
    
    
    public enum EnterpriseType{
        Warehouse("Warehouse"),
        Supplier("Supplier"),
        Store("Store"),
        Customer("Customer");
        
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
   
    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        organizationDirectory=new OrganizationDirectory();
        supplierDirectory=new SupplierDirectory();
        prodDir=new ProductDirectory();
        custDir=new CustomerDirectory();
    }
}
