/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagement;

import java.io.*;
public class Room {
    User u;
   private int TotalRooms = 20;
   private String RoomCategory;
   private int PentHouseQty = 5;
   private int KingSizedQty = 5;
   private int SingleBedRoomQty = 5;
   private int SuiteQty = 5;
   public int RoomCount = 0;
   public int BookPenthouseCount;
   public int BookKingsizedCount;
   public int BookSinglebedCount;
   public int BookSuiteCount;
   public int RoomCost = 0;
   
   public Room(){}
   public Room(User u) {
       this.u = u;
   }
   
   public Room(int TotalRooms, String RoomCategory){
   
       this.TotalRooms = TotalRooms;
       this.RoomCategory = RoomCategory;
   
   }
   public boolean isAvailable(){
   if(RoomCount <= TotalRooms)
       return true;
   else
       return false;
   }
   
    public boolean isPentHouseAvailable(){
   
       if(BookPenthouseCount <=PentHouseQty )
           return true;
       else 
           return false;
       
   }
   
    public boolean isKingSizedAvailable(){
   
       if(BookKingsizedCount <= KingSizedQty )
           return true;
       else 
           return false;
       
   }
     public boolean isSingleBedAvailable(){
   
       if(BookSinglebedCount <=SingleBedRoomQty )
           return true;
       else 
           return false;
       
   }
   
   public boolean isSuiteAvailable(){
   
       if(BookSuiteCount <=SuiteQty )
           return true;
       else 
           return false;
       
   }
   
   public void BookSingleBedroom(){
   
   try {
            FileWriter fw = new FileWriter("Room.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            fw.write("Single BedRoom");
        }
        catch(Exception fe){
        
            System.out.println(fe);
        }
        RoomCost += 2500;
        BookSinglebedCount++;
        RoomCount++;
   }
   public void BookKingSizedBedroom(){
   
   try {
            FileWriter fw = new FileWriter("Room.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            fw.write("King-Sized Bed Room");
       
      
       
        }
        catch(Exception fe){
        
            System.out.println(fe);
        }
         RoomCost+= 6000;
        BookKingsizedCount++;
        RoomCount++;
   }
   public void BookPentHouse(){
   
   try {
            FileWriter fw = new FileWriter("Room.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            fw.write(" PentHouse");
       
      
       
        }
        catch(IOException fe){
        
            System.out.println(fe);
        }
         RoomCost+= 10000;
        BookPenthouseCount++;
        RoomCount++;
   }
   public void BookSuite(){
   
   try {
            FileWriter fw = new FileWriter("Room.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            fw.write("Suite");
       
      
       
        }
        catch(Exception fe){
        
            System.out.println(fe);
        }
         RoomCost+= 10000;
        BookSuiteCount++;
        RoomCount++;
   }
   
   
   
   
}
