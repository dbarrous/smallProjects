/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg3;

// Lab 3: Time2Test.java
// Driver application for Time2 class
import java.util.Scanner;

public class Time2Test
{
   public static void main( String args[] )
   {
      Scanner input = new Scanner( System.in );
      
      Time2 time = new Time2(); // the Time2 object

      int choice = getMenuChoice();
      
      while ( choice != 4 ) // For problem 2 you may want to add 4 valid choises and quit with 5 instead of 4
      {
         switch ( choice )
         {
            case 1: // set hour
               System.out.print( "Enter Hours: " );
               int hours = input.nextInt();
               if (time.setHour(hours) == true){
               time.setHour(hours);
               }
               else{
                   System.out.println ("Invalid Statement, hours reset back to 0!");
               }
               
               
               break;             
            case 2: // set minute
               System.out.print( "Enter Minutes: " );
               int minutes = input.nextInt();
               
              if (time.setMinute(minutes) == true){
               time.setMinute(minutes);
               }               else{
                   System.out.println ("Invalid Statement, minutes reset back to 0!");
               }
               break;         
            case 3: // set seconds
               System.out.print( "Enter Seconds: " );
               int seconds = input.nextInt();
             if (time.setSecond(seconds) == true){
               time.setSecond(seconds);
               }
               else{
                   System.out.println ("Invalid Statement, seconds reset back to 0!");
               }
               break; 
            /* Problem 2: Write code here that calls method tick.*/
            
         } // end switch
         
         System.out.printf( "Hour: %d  Minute: %d  Second: %d\n",
            time.getHour(), time.getMinute(), time.getSecond() );
         System.out.printf( "Universal time: %s   Standard time: %s\n",
            time.toUniversalString(), time.toString() );

         choice = getMenuChoice();
      } // end while      
   } // end main

   // prints a menu and returns a value corresponding to the menu choice
   private static int getMenuChoice()
   {
      Scanner input = new Scanner( System.in );
      
      System.out.println( "1. Set Hour" );        
      System.out.println( "2. Set Minute" );
      System.out.println( "3. Set Second" );
      System.out.println( "4. Exit" );
      System.out.print( "Choice: " );
      
      /* Problem 2: You can add appropriate messages for calling method tick (adding a second to the time object)*/
      
      return input.nextInt();
   } // end method getMenuChoice
} // end class Time2Test
