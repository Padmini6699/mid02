/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fourthquestion;

/**
 *
 * @author Padmini Duggirala
 */
public class Vehicle {
    
  public void vehicleType() {
    System.out.println("Answer for Question4: Padmini Duggirala");
    System.out.println("Vehicles run on fuel");
  }
}

class Tesla extends Vehicle {
  public void vehicleType() {
    System.out.println("Tesla runs on electricity");
  }
}

class Bike extends Vehicle {
  public void vehicleType() {
    System.out.println("Bike runs on gasoline");
  }
}

class Main {
  public static void main(String[] args) {
    Vehicle myVehicle = new Vehicle();  // Create a Vehicle object
    Vehicle myTesla = new Tesla(); 
    Vehicle myBike = new Bike();  
    myVehicle.vehicleType();      //late binding polymorphism
    myTesla.vehicleType();
    myBike.vehicleType();
  }
}