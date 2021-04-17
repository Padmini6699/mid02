/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstquestion;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Padmini Duggirala
 */
public class DuplicateElements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> AL = new ArrayList<>();
        System.out.println("Answer for Question1: Padmini Duggirala");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter ten integers: ");
        for (int i = 0; i < 10; i++) {
            AL.add(scan.nextInt());
        }
        EliminateSimilar(AL);
    }

    public static void EliminateSimilar(ArrayList<Integer> list) {
        ArrayList<Integer> z = new ArrayList<>();
        for (Integer nmbr : list) {
            if (!(z.contains(nmbr))) {
                z.add(nmbr);
            }
        }
   
        System.out.print("The distinct integers are ");
        for (Integer distinct : z) {
            System.out.print(distinct + " ");
        }
        System.out.println();
    }
}
