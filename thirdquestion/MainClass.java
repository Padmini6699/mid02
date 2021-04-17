/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thirdquestion;
import java.util.*;

/**
 *
 * @author Padmini Duggirala
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Object> O = new ArrayList<Object>();
        System.out.println("Answer for Question3: Padmini Duggirala");
        Loan la=new Loan(234,2.5,1);
        Circle cir= new Circle(22.5,2.5,7.25);
        Date d=new Date();
        O.add(la);
        O.add(cir);
        O.add(d);
        for(int i=0;i<O.size();i++){
            System.out.println(O.get(i).toString());
        }
        
        
        
        
       
    }
    
}
