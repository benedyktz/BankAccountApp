package bankaccountapp;

public class CheckingAccount extends Account {
	
	//list properties specific to checking accounts
	private final int debitCardNumber;
	private final int debitCardPin;
	
	//constructor to initialize checking accounts properties
	public CheckingAccount(String name, String socialSecurityNumber, double initDeposit) {
		super(name, socialSecurityNumber, initDeposit);
		accountNumber = "2" + accountNumber;
		debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
		debitCardPin = (int) (Math.random() * Math.pow(10, 4));
	}
	
	//list methods specific to checking accounts

	public void showInfo() {
		System.out.println("checking");
		super.showInfo();
		System.out.println("Debit Card Number: " + debitCardNumber + 
				"\nDebit Card PIN: " + debitCardPin);
	}

}
