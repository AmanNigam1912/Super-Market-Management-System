/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.StoreInventory;

import Business.Product.ProductDirectory;
import java.util.ArrayList;

/**
 *
 * @author aman9
 */
public class StoreProductDirectory extends ProductDirectory{
    
    private ArrayList<StoreProduct> storeProductList;

    public StoreProductDirectory() {
        storeProductList = new ArrayList();
    }

    public ArrayList<StoreProduct> getStoreProductList() {
        return storeProductList;
    }
    
     
}
