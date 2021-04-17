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
public class OnlineGames {
    
  public void gameType() {
    System.out.println("Answer for Question4: Padmini Duggirala");
    System.out.println("Board games are fun");
  }
}

class SnakeAndLadder extends OnlineGames {
  public void gameType() {
    System.out.println("Snake and ladder is the most widely played board game after chess"); 
  }
}

class Ludo extends OnlineGames {
  public void gameType() {
    System.out.println("Ludo is one of the oldest board games ever");
  }
}

class Main {
  public static void main(String[] args) {
    OnlineGames myGames = new OnlineGames();  // Create a Vehicle object
    OnlineGames mySnakeAndLadder = new SnakeAndLadder(); 
    OnlineGames myLudo= new Ludo();  
    myGames.gameType();      //late binding polymorphism
    mySnakeAndLadder.gameType();
    myLudo.gameType();
  }
}