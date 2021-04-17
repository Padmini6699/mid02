/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ninthquestion;
import java.io.*;

/**
 *
 * @author Padmini Duggirala
 */
 interface SolarSystem {
  

	int speed = 460;
	void method1();

 }

 class Galaxy implements SolarSystem
{
	public void method1()
	{
	    System.out.println("Answer for Question9: Padmini Duggirala");
            System.out.println("Sun is at the centre of the solar system");
	}

	public static void main (String[] args)
	{
		SolarSystem obj = new Galaxy() ;
		obj.method1();
		System.out.println(speed);
	}
}


