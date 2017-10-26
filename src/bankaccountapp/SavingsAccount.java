package bankaccountapp;

import javax.print.attribute.SetOfIntegerSyntax;

public class SavingsAccount extends Account {
	
	//list properties specific to savings accounts
	private final int safetyDepositBoxId;
	private final int safetyDepositBoxKey;
	
	//constructor to initialize saving accounts properties
	public SavingsAccount(String name, String socialSecurityNumber, double initDeposit) {
		super(name, socialSecurityNumber, initDeposit);
		accountNumber = "1" + accountNumber;
		safetyDepositBoxId = (int) (Math.random() * 1000);
		safetyDepositBoxKey = (int) (Math.random() * 10000);
	}
	
	//list methods specific to savings accounts

	
	public void showInfo() {
		System.out.println("savings");
		super.showInfo();
		System.out.println("Safety Deposit Box ID: " + safetyDepositBoxId +
				"\nSafety Deposit Box Key: " + safetyDepositBoxKey);
	}

}
