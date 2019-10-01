/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runhorses;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Liyabona Saki
 */
public class horseUserControl  {
  
    static Scanner key = new Scanner(System.in);
    
             int numberOfHorses = 0;
             Horse [] horses = new Horse[20]; //change to 20
             
             
                public horseUserControl(){
                    
                       horses[0] = new raceHorse("fox" , "black" , 2.5 ,2,5);  
                       horses[1] = new raceHorse("Quick Quick", "grey", 1.6,3,1);
                       horses[2] = new workhorse("tom" , "green" , 2.5 , 2 , 4);
                       horses[3] = new workhorse("quick fox" , "grey" , 2.0 , 4 , 4);
                       horses[4] = new raceHorse("fluffy" , "yellow" , 1.8 , 2 , 3);
                       
                       numberOfHorses = 5;
                    
            
                }
                
                
       //==============================================================================         
    
             public void menuControl(){
                 
                 char quit = 'n';
              
                   String validate;
                    int choice;
              
                    while (quit != 'y'){
               
               
                    System.out.println("  \t\tHORSES MENU ");
                    System.out.println("===================================================\n");
                    
                    System.out.println("\nPlease Select The Option Of Your Choice ");
                    System.out.println("Option 1 : Add A Horse");
                    System.out.println("Option 2 : Display All Horses");
                    System.out.println("Option 3 : Display All RaceHorse");
                    System.out.println("Option 4 : Display All WorkHorses");
                    System.out.println("Option 5 : Can The WorkHorse Carry The Load");
                    System.out.println("Option 6 : A RaceHorse Has Won Another Race");
                    System.out.println("Option 9 : Exit");
                    
                    choice = key.nextInt();
                    
                  
                     switch (choice){
                        

                        case 1 :
                            add();
                            break;
                            
                        case 2 :
                            displayAllHorses();
                            break;
                            
                        case 3 :
                            displayAllRaceHorses();
                            break;
                            
                        case 4 :
                            displayAllWorkHorses();
                            break;
                            
                        case 5 :
                            canItCarryWorkLoad();
                            break;
                            
                        case 6 :
                            horseWinRace();
                            break;
                            
                        case 9 :
                            System.out.println("Would you like to quit y / n ? ");  
                            validate = key.next().toLowerCase(); // converts any valide input from the user to lowercase
                            quit = validate.charAt(0);
                            System.out.println("Thank you !!!\n");
                            break;
                            
                        default :
                            System.out.println("Wrong input please type again!!\n\n");
                           
                            
                            
                       }//end of switch 
              
                  
                }//end of while 
                    
                 
         }     
             
           
             
          //==============================================================================  
             
             private int menu(){//switch statement here
               
            
                int choice;
                
                System.out.println("1: Add A Horse");
                System.out.println("2: Display All Horses");
                System.out.println("3: Display All RaceHorses");
                System.out.println("4: Display All WorkHorses");
                System.out.println("5: Can The WorkHorse Carry The Load");
                System.out.println("6: A RaceHorse Has Won Another Race");
                System.out.println("9: Exit");
                
                choice = key.nextInt();
                return choice; 
         
         
         
         
         
          } 
          
          //==============================================================================
          
             private raceHorse createRaceHorse(){//it creates 
              
                System.out.println("What Is The RaceHorse Name?");
                String name = key.next();
                
                System.out.println("Please Enter The Colour");
                String colour = key.next();
                
                System.out.println("Please Enter The Height");
                double height = key.nextDouble();
                
                System.out.println("Please Enter The NumberOfRaces");
                int NumberOfRaces = key.nextInt();
                
                System.out.println("Please Enter The NumberOfWins");
                int NumberOfWins = key.nextInt();
                
                
                
                raceHorse rh = new raceHorse (name , colour , height ,NumberOfRaces,NumberOfWins); 
                
                return rh; 
               
               
             
           }
             
             //==============================================================================
           
          
          
            private workhorse createWorkHorse(){//it creates a workhorse
               
                System.out.println("What Is The WorkHorse Name?");
                String name = key.next();
                
                System.out.println("Please Enter The Colour");
                String colour = key.next();
                
                System.out.println("Please Enter The Height");
                double height = key.nextDouble();
                
                System.out.println("Please Enter The load in Kilograms That a horse can carry? ");
                int carryCapacity = key.nextInt();
                
                System.out.println("Please Enter The strenghtIndicator");
                int strenghtIndicator = key.nextInt();
               
              
               
                workhorse wh = new workhorse (name , colour , height ,carryCapacity,strenghtIndicator); 
                
                return wh; 
                
                
            }
            
            
            //==============================================================================
            
               private void add(){//it prompts the user to type their choice of horse
               
               System.out.println("\nAdd WorkHorse or RaceHorse");
               System.out.println("-------------------------");
               
               int choice;
               
                 System.out.println("Enter 1 to add WorkHorse ");
                 System.out.println("Enter 2 to add RaceHorse ");
               
                 choice = key.nextInt();
               
                    switch (choice){

                    case 1:
                       workhorse wh = createWorkHorse();
                       horses[numberOfHorses] = wh;
                       numberOfHorses++;
                       break;

                    case 2:
                       raceHorse rh = createRaceHorse();
                       horses[numberOfHorses] = rh;
                       numberOfHorses++;
                       break;

                    default:

                      System.out.println("Wrong choice");
        
                   
                   
                 
                    }
                    
           
               
            }
                
                
             //==============================================================================
                private void displayAllHorses(){ //display all horses

                  System.out.println("\nDisplay All Horses ");
                  System.out.println("-------------------------");

                 for(int i = 0 ; i < numberOfHorses ; i++ ) {
                     
                     System.out.println(horses[i].toString());
                     System.out.println("-------------------------"); 
                     
                     
                     
                  
                 }
                 


             }

           
            //==============================================================================
           
                    private void displayAllRaceHorses(){//display all RaceHorses

                      System.out.println("\nDisplaying all RaceHorses");
                      System.out.println("-------------------------");

                            for (int i = 0; i < numberOfHorses; i++) {

                              if (horses[i] instanceof raceHorse) {

                               raceHorse rh = (raceHorse) horses[i];

                                System.out.println(""+ rh.toString());
                                System.out.println("-------------------------");


                           }




                     }



                }
           
           
            //==============================================================================
            
                    private void displayAllWorkHorses(){ //display all WorkHorses


                         System.out.println("\nDisplaying all WorkHorse");
                         System.out.println("-------------------------");

                           for (int i = 0; i < numberOfHorses; i++) {

                             if (horses[i] instanceof workhorse) {

                                workhorse wh  = (workhorse) horses[i];
                                System.out.println(wh.toString());
                                System.out.println("-------------------------");


                             }



                         }



                     }
           
           
             //==============================================================================
           
                    private int findHorse(){//finding the horse


                     //String search = JOptionPane.showInputDialog("\nPlease enter the horse you want to search ");
                      
                      
                      
                      System.out.println("\nPlease enter the horse you want to search ");
                      String seachValue = key.next();
                      
                      
                      
                      boolean found = false; 
                      int arrayIndex = -1;
                      
                      
                       for(int i = 0 ; i < numberOfHorses ; i++){
                          
                          if(horses[i].getName().equals(seachValue)){
                              found = true;
                              arrayIndex = i++;
                              
                              
                          }
                          
                      }
                      
                  
                           if((found)){

                               System.out.println(horses[arrayIndex].getName());
                               System.out.println("arrayIndex " + arrayIndex );

                               }

                                  else {

                                 System.out.println("-1");

                        } 


                        return arrayIndex;

                }
           
           
           
            //==============================================================================
           
                private void horseWinRace(){ //call findhorse and increase the attributes using anotherWin and anotherRace

              //    System.out.println("Under Construction , please forgive the developer the poor guy is tired !!!  :) ");
              
                  raceHorse rh = new raceHorse();
                  
                       System.out.println(findHorse());

                     
                       //check if is there any horses found   
                       rh.anotherRace();
                       rh.anotherWin();



              }
           
           
           //==============================================================================

                private void canItCarryWorkLoad(){ //call findhorse to locate the horse that must carry load

                   workhorse w = new workhorse(); //calling the work horse class

                  
                       System.out.println(findHorse());
                       System.out.println("Please enter the load to be carried "); 
                       
                        int input;
                         input = key.nextInt();
                         w.canItCarryLoad(input);
                      
       

                   //comparism 

                  
                   


         }
           
    

}
