package com.company;

public class SavingsAccount extends Account{

    private double interest;
    private double interestRate;

    public SavingsAccount(int accountNumber, int amount, double interest) {
        this.interest = interest;

    }

    public double addInterest(double amount){

        return getBalance()+interest;
    }

    public  double getInterest(){
        return  interestRate;
    }
}
