package com.Application;

import com.framework.NormalAcc;
import com.framework.PrimeAcc;
import com.framework.ShopFactory;

public  class GSShopFactory extends ShopFactory  {

	
	public  PrimeAcc getNewPrimeAccount(int AccNo, String accNm, float charges, boolean isPrime)
	{
		GSPrimeAcc gsp= new GSPrimeAcc(AccNo,accNm,charges,isPrime);
		return gsp;
	}
	public  NormalAcc getNewNormalAccount(int AccNo, String accNm,float charges,float deliveryCharge)
	{
		GSNormalAcc gsn= new GSNormalAcc(AccNo,accNm,charges,deliveryCharge);
		return gsn;
		
	}

	
}
