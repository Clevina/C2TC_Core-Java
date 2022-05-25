package com.application;

import com.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc{
	
	private static final float MINBAL=0;
	public MMSavingAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
		// TODO Auto-generated constructor stub
	}
	public void withdraw(float accBal)
	{
		
	}
	
	@Override
	public String toString() {
		return "MMSavingAcc [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}