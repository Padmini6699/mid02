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
 interface Insects {
  

	float size = 3;
	void method1();

 }

 class worms implements Insects
{
	public void method1()
	{
	    System.out.println("Answer for Question9: Padmini Duggirala");	
            System.out.println("Major part of the insects' diet consists of worms ");
	}

	public static void main (String[] args)
	{
		Insects obj = new worms();
		obj.method1();
		System.out.println("The size of an average insect is " + size + " cm");
	}
 }