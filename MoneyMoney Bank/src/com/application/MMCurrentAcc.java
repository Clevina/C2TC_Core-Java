package com.application;

import com.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc{
	public MMCurrentAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
		// TODO Auto-generated constructor stub
	}
	public void withdraw(float creditLimit)
	{
		
	}
	@Override
	public String toString() {
		return "MMCurrentAcc [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}

