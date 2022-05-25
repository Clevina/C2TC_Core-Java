package com.framework;

public abstract class CurrentAcc extends BankAcc{
	
	private final float creditLimit=10;
	public CurrentAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
		// TODO Auto-generated constructor stub
	}
	public void withdraw(float creditLimit )
	{
		
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + "]";
	}
	

}
