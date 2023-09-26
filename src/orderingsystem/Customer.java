/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orderingsystem;

/**
 *
 * @author sbc-student
 */
public class Customer {
    
    private final String name;
    private final CreditCard creditCard;
    
    /**
     *
     * @param name
     * @param ccNumber
     */
    public Customer(String name, long ccNumber){
            this.name = name;
            this.creditCard = new CreditCard(ccNumber);
    }
    
    @Override
    public String toString(){
        return "Customer{"+"name="+name+ ",cCard="+creditCard+"}";
    }
}
