package hotelmanagement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maryam
 */
public abstract class Payment {
    private double amount; //paymentMethod variable??
    // Cash class??
    
    public Payment(){
       
    }
    
    public abstract void PaymentMethod(String method);
    
    public double getAmount(){
    return amount;
    }
    public void setAmount(double am){
    amount = am;
    }
    
    
}
