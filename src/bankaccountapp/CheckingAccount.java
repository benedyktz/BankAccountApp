package bankaccountapp;

public class CheckingAccount extends Account {
	
	//list properties specific to checking accounts
	private int debitCardNumber;
	private int debitCardPin;
	
	//constructor to initialize checking accounts properties
	public CheckingAccount(String name, String socialSecurityNumber, double initDeposit) {
		super(name, socialSecurityNumber, initDeposit);
		
	}
	
	//list methods specific to checking accounts

}
