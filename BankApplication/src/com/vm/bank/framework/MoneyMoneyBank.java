package com.vm.bank.framework;

public class MoneyMoneyBank {
	 public static void main(String[] args) {
	        // Create a bank account factory
	        MMBankFactory bankFactory = new MMBankFactory();

	        // Create a new savings account
	        SavingAcc savingAccount = bankFactory.getNewSavingAcc(101, "Rahul", 5000, true);

	        // Create a new current account
	        CurrentAcc currentAccount = bankFactory.getNewCurrentAcc(201, "Rohan", 10000, 2000);

	        // Display account info
	        System.out.println("Savings Account Details:");
	        System.out.println(savingAccount);

	        System.out.println("\nCurrent Account Details:");
	        System.out.println(currentAccount);

	        // transactions
	        savingAccount.withdraw(1000);
	        currentAccount.deposite(3000);

	        System.out.println("\nSavings Account Details after withdrawal:");
	        System.out.println(savingAccount);

	        System.out.println("\nCurrent Account Details after deposite:");
	        System.out.println(currentAccount);
	    }

}
