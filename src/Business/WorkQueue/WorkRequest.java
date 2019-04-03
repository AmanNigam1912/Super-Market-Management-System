/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Product.Product;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class WorkRequest {
    
    private int ProductId;
    private String ProductName;
    private int RequestedQuantity;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private String SupplierName;
    private String CustomerName;
    private String CustomerAddress;
    private int customerOrerID;
//    private Date requestDate;
//    private Date resolveDate;
//    private Product prod;
    
    
    public WorkRequest(){
//        requestDate = new Date();
        //prod = new Product();
    }

//    public String getMessage() {
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }

    public int getProductId() {
        return ProductId;
    }

    public void setProductId(int ProductId) {
        this.ProductId = ProductId;
    }

   

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public int getRequestedQuantity() {
        return RequestedQuantity;
    }

    public void setRequestedQuantity(int RequestedQuantity) {
        this.RequestedQuantity = RequestedQuantity;
    }

    
    
    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

//    public Date getRequestDate() {
//        return requestDate;
//    }
//
//    public void setRequestDate(Date requestDate) {
//        this.requestDate = requestDate;
//    }
//
//    public Date getResolveDate() {
//        return resolveDate;
//    }
//
//    public void setResolveDate(Date resolveDate) {
//        this.resolveDate = resolveDate;
//    }

//    public Product getProd() {
//        return prod;
//    }
//
//    public void setProd(Product prod) {
//        this.prod = prod;
//    }

    public String getSupplierName() {
        return SupplierName;
    }

    public void setSupplierName(String SupplierName) {
        this.SupplierName = SupplierName;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public String getCustomerAddress() {
        return CustomerAddress;
    }

    public void setCustomerAddress(String CustomerAddress) {
        this.CustomerAddress = CustomerAddress;
    }

    public int getCustomerOrerID() {
        return customerOrerID;
    }

    public void setCustomerOrerID(int customerOrerID) {
        this.customerOrerID = customerOrerID;
    }
    
    
    
    @Override
    public String toString() {
        return ProductName ;
    }
    
    
}
