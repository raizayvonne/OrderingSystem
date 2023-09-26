/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package orderingsystem;

/**
 *
 * @author sbc-student
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CreditCard cCard = new CreditCard( 3456L);
        Customer person = new Customer ("Raiza", 23456L);
        
        ShoppingCart cart = new ShoppingCart(); 
        Product ballpen = new Product( "Panda", 10);
        Product paper = new Product ("victory", 15);
        
        cart.addProduct(ballpen);
        cart.addProduct(paper);
        
        System.out.println(cart);
        System.out.println(cart.getTotalCost());
        
        System.out.println(person);
    
    }
    
}
