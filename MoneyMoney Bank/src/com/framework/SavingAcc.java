package com.framework;

public abstract class SavingAcc extends BankAcc {
	private boolean isSalary;
	private static final float MINBAL=0;
	public SavingAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
		// TODO Auto-generated constructor stub
	}
	public void withdraw(float accBal  )
	{
		
	}
	@Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalary + "]";
	}
}