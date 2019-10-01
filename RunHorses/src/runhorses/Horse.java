/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runhorses;

/**
 *
 * @author Liyabona Saki
 */
 abstract class Horse {
    
    private String name;
    private String colour;
    private double height;
    
    
    //default constructor
    public Horse(){
        
    }
      
   
  // ========================================================================  
   
    public Horse(String name, String colour, double height){
        
         this.name= name; 
         this.colour = colour;
         this.height = height;
         
    
    }
    
   // ========================================================================  
    public String getName(){
    return name;
    }
    
    public String getColour(){
    return colour;
    }
    
    public double getHeight(){
    return height;
    }
    
    public void setName(String name){
    this.name = name;
    }
    
    public void setColour(String colour){
    this.colour = colour;
    }
    
    public void setHeight(double height){
    this.height = height;
    }
    
    
    
    @Override
    public String toString(){
   return "Name  : " + name + "\nColour : " + colour + "\nHeight : " + height;
    
    }
    
    
    // ========================================================================   
    public void show(){
   
    System.out.println("Name   : "+ name);
    System.out.println("Colour : "+ colour);
     System.out.println("Height: "+ height);
   
      
      }
  // ========================================================================  
    
}
