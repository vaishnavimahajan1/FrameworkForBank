package com.vm.bank.framework;

public abstract class BankAcc {
	private int accNo;
	private String accNm;
	protected float accBal;
	
	public BankAcc(int accNo, String accNm, float accBal) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	
	
	public int getAccNo() {
		return accNo;
	}


	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}


	public String getAccNm() {
		return accNm;
	}


	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}


	public float getAccBal() {
		return accBal;
	}


	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}


	public void deposite(float amount) {
		accNo +=amount;
	}
	
	public abstract void withdraw(float amount);

	@Override
	public abstract String toString();

	
	
	
	

}
