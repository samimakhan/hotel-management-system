/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagement;

/**
 *
 * @author Samima
 */
public   class User extends Person {
    protected String phoneNumber, emailID; WelcomePage w; private String customerID;
    public User(){
        
    }
    public void setPhoneNumber(String number) {
        phoneNumber = number;
    }
    public void setEmail(String email) {
        emailID = email;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getEmail() {
        return emailID;
    }
 // code in user class
   public  void writeData(){}   
    public  void readData(){} 
    public String getCustomerID() {
    return ""; }
    public void setWelcomePage(WelcomePage w){
        this.w = w;
    }
    public WelcomePage getWelcomePage(){
        return w;
    }
            public void setCustomerID(String customerID){
            this.customerID = customerID;
        }
            


    
}
