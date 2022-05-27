package com.application;

import com.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc{
	
	private static final float MINBAL=1000.0f;
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal,isSalary);
	
		
	}
	public void withdraw(float accBal)
	{
		System.out.println("Dear  account user, your Saving  account balance is:"+accBal);
	}
	
	@Override
	public String toString() {
		return "MMSavingAcc [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}