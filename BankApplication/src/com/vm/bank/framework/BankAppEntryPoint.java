package com.vm.bank.framework;

public class BankAppEntryPoint {

	public static void main(String[] args) {
		BankFactory factory = new MMBankFactory();
		
		SavingAcc savingAcc = factory.getNewSavingAcc(101, "Vaishnavi", 5000, true);
		
		CurrentAcc currentAcc = factory.getNewCurrentAcc(201, "Tina", 1000, 2000);
		
		savingAcc.withdraw(2000);
		currentAcc.withdraw(30000);
		
		System.out.println(savingAcc);
		System.out.println(currentAcc);
		

	}

}
