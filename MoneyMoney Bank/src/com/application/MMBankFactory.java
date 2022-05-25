package com.application;

import com.framework.BankFactory;
import com.framework.CurrentAcc;
import com.framework.SavingAcc;

public abstract class MMBankFactory extends BankFactory {

	public  SavingAcc getNewSavingAccount(int AccNo,  String accNm, float  accBal, 
			boolean isSalaried)
	{
		return null;
		
	}
	  
	   public  CurrentAcc getNewCurrentAccount(int AccNo,  String accNm, float accBal, 

			  float creditLimit)
	   {
		return null;
		   
	   }
}
