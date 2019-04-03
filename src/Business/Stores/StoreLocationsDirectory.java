/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Stores;

import Business.Customer.Customer;
import java.util.ArrayList;

/**
 *
 * @author aman9
 */
public class StoreLocationsDirectory {
    
    private ArrayList<StoreLocation> storeLocationsList;

    public StoreLocationsDirectory() {
        storeLocationsList = new ArrayList();
    }

    public ArrayList<StoreLocation> getStoreLocationsList() {
        return storeLocationsList;
    }
    
   //Method to Add stores
   public StoreLocation addStore()
   {
       StoreLocation location = new StoreLocation();
       storeLocationsList.add(location);
       return location;
       
   } 
}
