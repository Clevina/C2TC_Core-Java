package com.Client;

import com.Application.GSNormalAcc;
import com.Application.GSPrimeAcc;
import com.Application.GSShopFactory;
import com.framework.NormalAcc;
import com.framework.PrimeAcc;
import com.framework.ShopFactory;

public class Client {

	public static void main(String[] args) {
		
		ShopFactory sf =new GSShopFactory();
		PrimeAcc pa = new GSPrimeAcc(555, "Clevina", 3000, true);
		pa.bookProduct(pa.getCharges());
		pa.toString();
		NormalAcc na = new GSNormalAcc(156, "Seema", 2000, 40);
		na.bookProduct(na.getDeliveryCharge());
		na.toString();
	}

}
