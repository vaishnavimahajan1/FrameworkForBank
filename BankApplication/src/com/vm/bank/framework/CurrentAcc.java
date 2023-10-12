package com.vm.bank.framework;

public abstract class CurrentAcc extends BankAcc {
	private final float creditLimit;

	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}
	
	@Override
	public void withdraw(float amount) {
		if(accBal + creditLimit >= amount) {
			accBal -= amount;
		}else {
			System.out.println("Withdrawal not allowed. Insufficient funds.");
		}
	}
	@Override
	public void deposite(float amount) {
		accBal +=amount;
	}
	@Override
	public abstract String toString();
	
	

}
