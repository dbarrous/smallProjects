/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BettingProgram;

/**
 *
 * @author Damian's PC
 */
public class Player {
    private String name;
    private int cash;
    
    public Player(String n, int s)
    {
        name = n;
        cash = s;
    }
    public Player(int s){
       
    }
    
    public String getName()
    {
        return name;
    }
    public int getCash()
    {
        return cash;
    }
    public void addCash(int add){
        cash += add;
    }
    public void subCash(int sub){
        cash-= sub;
    }
    @Override
    public String toString()
    {
        return "(" + name + ", Balance: $" + cash + ")";
    }
}

