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
public class Loan {
    private int loanAmount;
    private double interestRate;
    private int years;

    public Loan(int loanAmount, double interestRate, int years) {
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.years = years;
    }

    @Override
    public String toString() {
        return "Loan{" + "loanAmount=" + loanAmount + ", interestRate=" + interestRate + ", years=" + years + '}';
    }
    
    
    
}
