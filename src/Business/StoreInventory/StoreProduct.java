/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.StoreInventory;

/**
 *
 * @author aman9
 */
public class StoreProduct {
    
    private int storeProductId;
    private String storeProductName;
    //private String storeProductType;
    private int storeProductQty;

    public int getStoreProductId() {
        return storeProductId;
    }

    public void setStoreProductId(int storeProductId) {
        this.storeProductId = storeProductId;
    }

    public String getStoreProductName() {
        return storeProductName;
    }

    public void setStoreProductName(String storeProductName) {
        this.storeProductName = storeProductName;
    }

//    public String getStoreProductType() {
//        return storeProductType;
//    }
//
//    public void setStoreProductType(String storeProductType) {
//        this.storeProductType = storeProductType;
//    }

    public int getStoreProductQty() {
        return storeProductQty;
    }

    public void setStoreProductQty(int storeProductQty) {
        this.storeProductQty = storeProductQty;
    }
    
    
    
}
