package com.framework;

public  class SavingAcc extends BankAcc {
	private boolean isSalary;
	private static final float MINBAL=1000.0f;
	public SavingAcc(int accNo, String accNm, float accBal, boolean   isSalary) {
		super(accNo, accNm, accBal);
		this.isSalary=isSalary;
	}
	public void withdraw(float accBal  )
	{
		System.out.println("Dear  account user, your  Saving account balance is:"+accBal);
	}
	@Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalary + "]";
	}
}