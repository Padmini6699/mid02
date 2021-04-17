/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seventhquestion;
import java.util.Scanner;
/**
 *
 * @author Padmini Duggirala
 */
public enum Flights {
    DOMESTICFLIGHTS,INTERNATIONALFLIGHTS;
    
}
class Main{
    Flights d;

    public Main(Flights d) {
        this.d = d;
    }

   public void typeOfFlights() {
        switch(d) {
           case DOMESTICFLIGHTS:
                System.out.println("Answer for Question7: Padmini Duggirala");
                System.out.println("type of flights: Domestic flights");
                break;
           case INTERNATIONALFLIGHTS:
                System.out.println("type of flights: International flights");
                break;
           
           default:
               System.out.println("These are t");
       }
   }
   public static void main(String[] args) {
       Main m1= new Main(Flights.DOMESTICFLIGHTS);
       m1.typeOfFlights();
       Main m2= new Main(Flights.INTERNATIONALFLIGHTS);
       m2.typeOfFlights();
      
   }
}
        

                       
    
 

       

