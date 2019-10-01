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
public class workhorse extends Horse {
    
    static Scanner key = new Scanner(System.in);
    private int carryCapacity;
    private int strenghtIndicator;
    
    
    public workhorse(){

}

     //arguemented constructor
    public workhorse(String name , String color , double height , int carryCapacity , int strengthIndicator){
        
        super(name , color ,height);
        this.carryCapacity = carryCapacity;
        this.strenghtIndicator = strengthIndicator;
    }
    
    //==============================================================================
    
    
     //Encapsulation

    public int getCarryCapacity() {
        return carryCapacity;
    }

    public void setCarryCapacity(int carryCapacity) {
        this.carryCapacity = carryCapacity;
    }
    

    public int getStrenghtIndicator() {
        return strenghtIndicator;
    }

    public void setStrenghtIndicator(int strenghtIndicator) {
        this.strenghtIndicator = strenghtIndicator;
    }
    
   //==============================================================================
    
    @Override
    public String toString(){
        
       return super.toString() +
               "\ncarryCapacity : " +carryCapacity + " \nstrengthIndicator : " + strenghtIndicator ;
               
    }
    
    
    //==============================================================================
    
    //it checks wheather a specific horse can carry a specific load
    
    public boolean canItCarryLoad(double load){
        
       
      while(true){
        
        if (load == 1){
            
            System.out.println("Weak");
            break;
        }
            
           if( load == 2){
               
              System.out.println("Not too bad"); 
              break;
           }
               
               if(load == 3){
                   
                 System.out.println("Strong");
                 break;
             }
                       
                if (load == 4){
                     
                   System.out.println("Very ,very strong"); 
                   break;
               }
                
                 
                else {
                  
                    System.out.println("The horse cannot carry that load");
                    break;
                }
            
             
             }
      
       return true;
       
       //try to do this shit asside strengthIndicator
      
     }
    
    
    
    
}
    
   