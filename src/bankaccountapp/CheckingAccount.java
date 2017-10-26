package bankaccountapp;

public class CheckingAccount extends Account {
	
	private final int debitCardNumber;
	private final int debitCardPin;
	
	public CheckingAccount(String name, String socialSecurityNumber, double initDeposit) {
		super(name, socialSecurityNumber, initDeposit);
		accountNumber = "2" + accountNumber;
		debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
		debitCardPin = (int) (Math.random() * Math.pow(10, 4));
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() - 0.25;
	}
	

	public void showInfo() {
		System.out.println("checking");
		super.showInfo();
		System.out.println("Debit Card Number: " + debitCardNumber + 
				"\nDebit Card PIN: " + debitCardPin + 
				"\nRate is: " + rate);
	}

}
