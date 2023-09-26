/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orderingsystem;

/**
 *
 * @author sbc-student
 */
public class Product {

    
    private final String name;
    private final int price;
      
    public Product(String name, int price){
        this.name = name;
        this.price = price;             
    }
    
    public int getPrice(){
       return price; 
    }
 @Override
 public String toString() {
     return "Product{"+"name=" + name +", price=" + price + "}";
 }

    private static class T {

        public T() {
        }
    }
  
}
