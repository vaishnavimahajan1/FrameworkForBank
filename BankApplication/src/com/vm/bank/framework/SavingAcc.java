package com.vm.bank.framework;

public abstract class SavingAcc extends BankAcc {
	private boolean isSalaried;
	private static final float MINBAL = 1000.0f;
	private float accBal;

	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}
	
	@Override
	public void withdraw(float amount) {
		if(accBal - amount >= MINBAL) {
			accBal -= amount;
		}else {
			System.out.println("Withdrawal not allowed. Minimum balance must be maintained.");
		}
	}

	@Override
	public abstract String toString();
	
	

}
