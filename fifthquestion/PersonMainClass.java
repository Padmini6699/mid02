/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fifthquestion;

import java.util.Date;

/**
 *
 * @author Padmini Duggirala
 */
public class PersonMainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date obj = new Date();
        Person p1 = new Person("yashwanth", "Pochavaram",
                0123, "padduduggirala");
        Student s1 = new Student(9.4, "manisha", "Maryville",
                909090909, "v@gmail.com");
        Employee e1 = new Employee("Northwest", 12000, obj, "aneela",
                "Maryville", 123456, "k@gmail.com");
        Staff s2 = new Staff("Assistant", "Libarary", 12000, obj,
                "Pranee", "MAryville", 89898989, "r@gmail.com");
        Faculty f1 = new Faculty(12, 3, "Colden Hall", 100000, obj,
                "Aditya", "Northwest", 787878787, "bb@gmail.com");
        System.out.println("Answer for Question5: Padmini Duggirala");
        System.out.println(p1);
        System.out.println(s1);
        System.out.println(e1);
        System.out.println(s2);
        System.out.println(f1);
    }

}
