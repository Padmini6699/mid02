/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thirdquestion;

/**
 *
 * @author Padmini Duggirala
 */
public class Circle {
    private double cirumference;
    private double radius;
    private double diametre;

    public Circle(double cirumference, double radius, double diametre) {
        this.cirumference = cirumference;
        this.radius = radius;
        this.diametre = diametre;
    }

    @Override
    public String toString() {
        return "Circle{" + "cirumference=" + cirumference + ", radius=" + radius + ", diametre=" + diametre + '}';
    }
    
    
}
