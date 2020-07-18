/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagement;

import java.io.*;



public class Member extends User {
   private String address, gender, CNIC;
   private String customerID; WelcomePage w;
    Member(String name, String password, String phone, String email, String address, String CNIC, String gender){
        this.name = name;
        this.password = password;
        this.address = address;
        this.CNIC = CNIC;
        phoneNumber = phone;
        emailID = email; 
        this.gender = gender;
    }
    
    public void writeData(){
        try{
     FileWriter file = new FileWriter("memberLogInData.txt", true);
    BufferedWriter bw = new BufferedWriter(file);
    customerID = "1000";
    readData();
    bw.newLine();
    bw.write(customerID + " " + password);
    bw.close(); file.close();
    
    
    FileWriter f = new FileWriter ("memberdata.txt", true);
        BufferedWriter bb = new BufferedWriter(f);
        bb.newLine();
        bb.write(customerID + "  ");    // customer id, password, name, phone, email, address, CNIC, gender
        bb.write(password + "  ");
        bb.write(name + "  ");
        bb.write(phoneNumber + "  ");
        bb.write(emailID + "  ");
        bb.write(address + "  ");
        bb.write(CNIC + "  ");
        bb.write(gender + "  ");
       
        bb.close(); 
        f.close();
        setCustomerID(customerID);
    
    }
    
    catch (Exception e) {
    System.out.println(e);
} }
    
    public void readData(){
        try{
        int ID = 0;
        BufferedReader b = new BufferedReader(new FileReader("memberLogInData.txt"));
        String line = b.readLine();
        while (line != null) {
         if (line.contains(customerID)) {
            ID = Integer.parseInt(customerID) + 1;
            customerID = ID + ""; 
            
         }  
         line = b.readLine();
        } }
        catch(Exception e) {
        System.out.println(e);
        }
    }
        public String getCustomerID(){
            return customerID;
        }
        

      public void setWelcomePage(WelcomePage w){
              this.w = w;
}
      public WelcomePage getWelcomePage(){
          return w;
      }
        
        
        
        
        
    }
        
       
       
       
  

   

/* /* public void setName(String name) {
        this.name = name;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getName(){
        return name;
    }
    public String getPassword() {
        return password;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }
    public void setGender(String gender){
        this.gender= gender;
    }
    public String getGender() {
            return gender;
}
    public void setCNIC(String CNIC) {
        this.CNIC = CNIC;
    }
    public String getCNIC(){
        return CNIC; 
    } */
 

  
