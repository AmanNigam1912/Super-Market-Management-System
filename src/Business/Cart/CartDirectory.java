/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Cart;

import Business.Network.City;
import java.util.ArrayList;

/**
 *
 * @author aman9
 */
public class CartDirectory {
     private ArrayList<Cart> cartList;

    public ArrayList<Cart> getCartList() {
        return cartList;
    }
    public CartDirectory() {
        cartList = new ArrayList();
    }

    public void setCartList(ArrayList<Cart> Cart) {
        this.cartList = cartList;
    }
      public Cart addToCart()
   {
       Cart cart = new Cart();
       cartList.add(cart);
       return cart;
       
   }
      
    public void removeProductfromCart(Cart cart){
        cartList.remove(cart);
    }  
     
}
