/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagement;

import java.io.*;
public class Services {
    User u;
    private boolean RoomService;
    private boolean DineIn;
    private boolean pool;
    private boolean club;
    private boolean foodOrdering;
    public int ServiceCount;
    public double ServiceCost;
    private String services;
    
    
    public Services(boolean RoomService,boolean DineIn,boolean pool,boolean club,boolean foodOrdering){
    this.DineIn = DineIn;
    this.RoomService = RoomService;
    this.club = club;
    this.foodOrdering = foodOrdering;
    this.pool = pool;
    
    }
    public Services(){
       this.DineIn = false;
    this.RoomService = false;
    this.club = false;
    this.foodOrdering = false;
    this.pool = false;
    ServiceCount = 0;
    ServiceCost = 0;
    }
    public Services(User u){
        this.u = u;
         this.DineIn = false;
    this.RoomService = false;
    this.club = false;
    this.foodOrdering = false;
    this.pool = false;
    ServiceCount = 0;
    ServiceCost = 0;
    }
    
    public boolean AvailPool(){
       
            pool = true;

    services += "pool ";
        ServiceCost += 5500;
        ServiceCount++;
        return pool;
    }
    public boolean AvailRoomService(){
      
              RoomService = true;
    
       services += "room service ";
        ServiceCost += 2000;
        ServiceCount++;
        return RoomService;
    }
    public boolean AvailClub(){
     services += "club ";
        ServiceCost += 6000;
        ServiceCount++;
        club = true;
      return club;
    }
    
    public boolean AvailDineIn(){
        services += "dine in ";
              DineIn = true; 
 
       
       
        ServiceCost += 5000;
        ServiceCount++;
      
       return DineIn;
    }
    
    public boolean AvailFoodOrdering(){
        
         services += "food ordering";
            foodOrdering = true; 
  
        
        
        
        ServiceCost += 500;
        ServiceCount++;
        
        return foodOrdering;
    }
    public int getTotalServices(){
    
        return ServiceCount;
    }
    
    public double getTotalServiceCost(){
    
        return ServiceCost;
    }

        public String getServicesAvailed(){
            return services;
        }
        
}
