/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eightquestion;

/**
 *
 * @author Padmini Duggirala
 */
public class Google extends TechCompanies {
    
    public Google() {
         
    }

    @Override
    public String name() {
        return ("The name is google" );
    }
    public static void main(String [] args){
        TechCompanies t=new Google();
        System.out.println("Answer for Question8: Padmini Duggirala");
        System.out.println("The CEO of google is sunder pichai"); 

    }
}
