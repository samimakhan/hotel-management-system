/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagement;

import hotelmanagement.CreditCardPayment;
import hotelmanagement.Payment;

/**
 *
 * @author Maryam
 */
public class CreditCard extends Payment {
    private double amount;
    private String CardNumber;
    private String PinNumber;
    String paymentMethod = "CreditCard";
    CreditCardPayment cd = new CreditCardPayment();
      public CreditCard(double amount){
    this.amount = amount;}
    public void PaymentMethod(String paymentmethod){
    
        if (this.paymentMethod.equalsIgnoreCase(paymentmethod))
            cd.setVisible(true);
        
    }
    
  
    
    public double getAmount(){
        return amount;
    }

}
