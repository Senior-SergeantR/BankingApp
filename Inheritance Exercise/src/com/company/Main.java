package com.company;

public class Main {

    public static void main(String[] args) {
        // create a bank object
        Bank bank = new Bank();
        bank.update();

        //creating test accounts
	    Account account1 = new SavingsAccount(125355,200,0.5);
        Account account2 = new CurrentAccount(125355,200,300);
        Account account3 = new SavingsAccount(125355,200,0.5);
        Account account4 = new CurrentAccount(125355,200,300);



        //add account to the bank
        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);
        bank.addAccount(account4);
        
        // displaying account details

        for (Account account: bank.getAccounts()){
            if (account instanceof SavingsAccount){
                SavingsAccount savingsAccount = (SavingsAccount) account;
                System.out.println("Account Number: "+account.getBalance());
                System.out.println("Balance: "+account.getBalance());
                System.out.println("Interest Rate: "+savingsAccount.getInterest());
                System.out.println("===================================");

            }else if(account instanceof  CurrentAccount){
                CurrentAccount currentAccount = (CurrentAccount)  account;
                System.out.println("Account Number: "+account.getAccountNumber());
                System.out.println("Balance: "+account.getBalance());
                System.out.println("Overdraft Limit: "+currentAccount.getOverdraftLimit());
                System.out.println("===================================");
            }
        }

    }
}
