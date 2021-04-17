/*(
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seventhquestion;

/**
 *
 * @author Padmini Duggirala
 */
public enum  Series {
    DRAMA,ACTION,HORROR;
    
}
class Main{
    Series s;

    public Main(Series s) {
        this.s = s;
    }

   public void genresOfSeries() {
        switch(s) {
           case DRAMA:
                System.out.println("Answer for Question7: Padmini Duggirala");
                System.out.println("genres of series: Drama");
                break;
           case ACTION:
                System.out.println("genres of series: Action");
                break;
           case HORROR:
                System.out.println("genres of series: Horror");
                break;
           default:
               System.out.println("These are the genres in series");
       }
   }
   public static void main(String[] args) {
       Main m1= new Main(Series.DRAMA);
       m1.genresOfSeries();
       Main m2= new Main(Series.ACTION);
       m2.genresOfSeries();
       Main m3= new Main(Series.HORROR);
       m3.genresOfSeries();
   }
}
        

                       
    
 

       

