package com.company;

public class Account {

    /**
     A class for bank accounts.

     This class provides the basic functionality of accounts.
     It allows deposits and withdrawals but not overdraft
     limits or interest rates.
     @author RABIN OTIENO
     */


        private double balance;  //The current balance
        private int accountNumber;  //The account number

        public Account(){

        }
        public Account(int a)
        {
            balance =0.0;
            accountNumber =a;
        }



    public void deposit(double sum)
        {
            if (sum>0)
                balance +=sum;
            else
                System.err.println("Account.deposit(...): "
                        +"cannot deposit negative amount.");
        }

        public void withdraw(double sum)
        {
            if (sum>0)
                balance -=sum;
            else
                System.err.println("Account.withdraw(...): "
                        +"cannot withdraw negative amount.");
        }

        public double getBalance() {
            return balance;
        }

        public double getAccountNumber()
        {
            return accountNumber;
        }

        public String toString()
        {
            return "Acc " + accountNumber + ": " + "balance = " + balance;
        }

        public final void print()
        {
            //Don't override this,
            //override the toString method
            System.out.println( toString() );
        }

    }

