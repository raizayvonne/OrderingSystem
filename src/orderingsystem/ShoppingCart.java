/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orderingsystem;


import java.util.ArrayList;
import java.util.List;
import java.util.function.ToIntFunction;

/**
 *
 * @author sbc-student
 */
public class ShoppingCart {
    private final List<Product>list = new ArrayList<>();
    
    public ShoppingCart(){
    }
    
    public void addProduct(Product product){
        list.add ( product);
    }
    
    public int getTotalCost(){
        return list.stream()
              .mapToInt(Product::getPrice)
                .sum();
                
        
    }

    @Override
    public String toString() {
        return "ShoppingCart{" + "list=" + list + '}';
    }
}
     
