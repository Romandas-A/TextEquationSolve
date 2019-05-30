package Algorithms;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public enum Operator {
    PLUS("+"), MINUS("-"), DIVIDE("/"), MULTIPLY("*"), POWER("^");
    
    
    private String symbol;

    private Operator(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
    
    
}
