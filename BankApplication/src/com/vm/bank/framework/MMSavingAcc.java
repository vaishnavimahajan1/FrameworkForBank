package com.vm.bank.framework;

public class MMSavingAcc extends SavingAcc {
	private static final float MINBAL = 2000.0f;
	
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);

	}
	
	@Override
	public void withdraw(float amount) {
		if(getAccBal() - amount >= MINBAL) {
			setAccBal(getAccBal() - amount);
		}else {
			System.out.println("Withdrawal not allowed. Minimum balance must be maintained.");
		}
	}

	@Override
	public String toString() {
		return "Account No: " + getAccNo() + ", Name: " + getAccNm() + ", accBal " + getAccBal() + "";
	}
	
	
	

}
