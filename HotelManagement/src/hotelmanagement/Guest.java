/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagement;

/**
 *
 * @author Samima
 */ import java.io.*;
public class Guest extends User {
    private String name ,password, phone, CNIC, customerID; WelcomePage w;

    public Guest(String name, String password, String phone, String CNIC){
   this.name = name;
   this.CNIC = CNIC;
   this.password = password;
   this.phone = phone;

}
    // guest class code
     public void writeData(){
        try{
             FileWriter file = new FileWriter("guestdata.txt", true);
    BufferedWriter bw = new BufferedWriter(file);
    customerID = "9000";
    readData();
    bw.newLine();
    bw.write(customerID + "  " + password + "  ");
       
        bw.write(name + "  ");             //customer id, password, name, phone, CNIC
        bw.write(phone + "  ");
        bw.write(CNIC + "  ");
        bw.close();
    setCustomerID(customerID);
        
   
    
    }
    
    catch (Exception e) {
    System.out.println(e);
} }
     
     public void readData(){
        try{
        int ID = 0;
        BufferedReader b = new BufferedReader(new FileReader("guestLogInData.txt"));
        String line = b.readLine();
        while (line != null) {
         if (line.contains(customerID)) {
            ID = Integer.parseInt(customerID) + 1;
            customerID = ID + ""; 
         } 
         line = b.readLine();
        } b.close();}
        catch(Exception e) {
        System.out.println(e);
        }
    }
      public String getCustomerID(){
            return customerID;
        }
      

}