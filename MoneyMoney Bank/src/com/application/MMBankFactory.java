package com.application;

import com.framework.BankFactory;

import com.framework.CurrentAcc;
import com.framework.SavingAcc;

public class MMBankFactory extends BankFactory {

	@Override
	public SavingAcc getNewSavingAccount(int accNo, String accNm, float accBal, boolean isSalary) {
		MMSavingAcc ms= new MMSavingAcc(accNo,accNm,accBal,isSalary);
		return ms;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal, float creditLimit) {
		MMCurrentAcc mc= new MMCurrentAcc(accNo,accNm,accBal,creditLimit);
		return mc;
	}

}




