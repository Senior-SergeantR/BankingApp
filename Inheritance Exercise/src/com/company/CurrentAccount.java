package com.company;

public class CurrentAccount extends Account{

    private double overdraftLimit;

    public CurrentAccount(int accountNumber, double balance, double overdraftLimit){
        super(accountNumber);
        this.overdraftLimit = overdraftLimit;


    }

    public  void deposit(double amount){
       deposit(amount);
    }

    public double getOverdraftLimit(){
        return overdraftLimit;
    }

}
