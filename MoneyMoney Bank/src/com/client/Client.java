package com.client;

import com.application.MMBankFactory;
import com.application.MMCurrentAcc;
import com.application.MMSavingAcc;
import com.framework.BankFactory;
import com.framework.CurrentAcc;
import com.framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
		BankFactory bf=new MMBankFactory();
		SavingAcc sa=new MMSavingAcc(1, "Clevina", 1000.00f, true);
		sa.withdraw(sa.getAccBal());
		sa.toString();
		CurrentAcc ca=new MMCurrentAcc(2, "Seema",100.00f, 10f);
		ca.withdraw(ca.getCreditLimit());
		ca.toString();
	}

}
