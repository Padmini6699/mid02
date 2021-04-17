/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondquestion;

import java.util.Scanner;

/**
 *
 * @author Padmini Duggirala
 */
public class IdenticalElements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Prompt the user to enter two 3 x 3 arrays of integers
		System.out.println("Answer for Question2: Padmini Duggirala");
                System.out.print("Enter list1: ");
		int[][] list1 = getArray();
		System.out.print("Enter list2: ");
		int[][] list2 = getArray();

		// Display whether the two arrays are strictly identical.
		System.out.println("The two arrays are" + 
			(equals(list1, list2) ? " " : " not ") + "strictly identical");
	}

	/** equals returns true if m1 and m2 are strictly identical */
	public static boolean equals(int[][] m1, int[][] m2) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (m1[i][j] != m2[i][j])
					return false;
			}
		}
		return true;
	}

	/** getArray initializes and returns a 3 X 3 array */
	public static int[][] getArray() {
		Scanner input = new Scanner(System.in);
		int[][] m = new int[3][3];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = input.nextInt();
			}
		}
		return m;
	}
}
 