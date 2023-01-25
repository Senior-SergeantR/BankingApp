package com.company;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Account> accounts;

    public Bank(){
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account){
        accounts.add(account);
    }

    public ArrayList<Account> getAccounts(){
        return accounts;
    }

    public void update(){
        for (Account account : accounts){
            if (account instanceof SavingsAccount){
                SavingsAccount savingsAccount = (SavingsAccount)  account;
                double interest = savingsAccount.getBalance()*savingsAccount.getInterest();
                savingsAccount.deposit(interest);

            }else if (account instanceof  CurrentAccount){
                CurrentAccount currentAccount = (CurrentAccount) account;
                if (currentAccount.getBalance()<0){
                    System.out.println("Sending letter  to the account number: " +
                            currentAccount.getAccountNumber() +" as the account is in overdraft");
                }
            }
        }
    }

    public void openAccount(Account account){
        accounts.add(account);
        System.out.println("Account Opened successfuly. Account Number: " +
                account.getAccountNumber());
    }

    public void  closeAccount(int accountNumber){
        Account accountToRemove = null;

        for (Account account : accounts){
            if (account.getAccountNumber() == accountNumber){
                accountToRemove = account;
                break;
            }
        }

            if (accountToRemove != null){
                accounts.remove(accountToRemove);
                System.out.println("Account closed successfully and permanently: " +
                        accountNumber);
            }else {
                System.out.println("Account not found");
            }


        }

    public void payDividend(double dividend){
            for (Account account: accounts){
                account.deposit(dividend);
            }
    }

}
