/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Product;

import java.util.ArrayList;

/**
 *
 * @author aman9
 */
public class ProductDirectory {
    
    private ArrayList<Product> productList;

    public ProductDirectory() {
        productList = new ArrayList<Product>();
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }
    
    public Product addProduct(){
        Product prod= new Product();
        productList.add(prod);
        return prod;
    }
    public void removeProducet(Product p){
        productList.remove(p);
    }
       
}
