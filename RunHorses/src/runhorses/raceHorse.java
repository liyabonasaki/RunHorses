/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runhorses;
import java.util.*;
/**
 *
 * @author Liyabona Saki
 */
public class raceHorse extends Horse {
    
    static Scanner key = new Scanner (System.in);
    
    
      private int NumberOfRaces;
        private int NumberOfWins;
        
        
        //default constructor
        public raceHorse(){
            
        }
        
     
    
        public raceHorse(String name, String colour, double height, int NumberOfRaces, int NumberOfWins){
        super (name,colour,height); // because it has inherited these attributes from horse class
        this.NumberOfRaces= NumberOfRaces;
        this.NumberOfWins= NumberOfWins;
    
    }
    // ========================================================================  

 
   
   
      public int getNumberOfRaces() {
        return NumberOfRaces;
      }

      public int getNumberOfWins() {
        return NumberOfWins;
      }

      public void setNumberOfRaces(int NumberOfRaces) {
        this.NumberOfRaces = NumberOfRaces;
      }

      public void setNumberOfWins(int NumberOfWins) {
        this.NumberOfWins = NumberOfWins;
      }
    // ========================================================================
    
    // ========================================================================
      
    
    @Override
    public String toString() {
        return super.toString()+
        "\nNumberOfRaces = "+ NumberOfRaces + "\nNumberOfWins = "+ NumberOfWins;
        
    }
    // ========================================================================
    
    // ========================================================================
    
  @Override  
    public void show(){
    System.out.println("NumberOfRaces:"+ NumberOfRaces);
    System.out.println("NumberOfWins:"+ NumberOfWins);
    }
     public void anotherWin(){
         NumberOfWins++;
     
     }
     
     public void anotherRace(){
         
         NumberOfRaces++;
         
     }
     // ========================================================================
     
    
    
}
