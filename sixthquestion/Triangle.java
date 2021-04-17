/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sixthquestion;

/**
 *
 * @author Padmini Duggirala
 */
public  class Triangle extends GeometricObject {

    private double Side_a;
    private double Side_b;
    private double Side_c;
    private boolean Filled;
    private String ColorOfTriangle;
    public Triangle(double Side_a, double Side_b, double Side_c,
    boolean Filled, String ColorOfTriangle) {
    this.Side_a = Side_a;
    this.Side_b = Side_b;
    this.Side_c = Side_c;
    this.Filled = Filled;
    this.ColorOfTriangle = ColorOfTriangle;

    }
    
    @Override
    double AreaofT() {
        double L = this.perimeterOfT() / 2;
        return Math.sqrt(Math.abs(L * (L - Side_a)
                * (L - Side_b) * (L - Side_c)));
    }
   
    @Override
    double perimeterOfT() {
        return this.Side_a + this.Side_b + this.Side_c;
    }

    @Override
    public String toString() {
        return "Triangle properties: \nArea is " + Math.round(this.AreaofT() * 100) / 100.0 + "\nPerimeter is " + this.perimeterOfT() + "\nThe Triangle is " + (Filled ? "Filled" : "Not Filled ")  + "\nTriangle Color is " + ColorOfTriangle;
    }

}

    
    

