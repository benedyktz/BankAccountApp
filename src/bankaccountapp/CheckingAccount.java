package bankaccountapp;

public class CheckingAccount extends Account {
	
	//list properties specific to checking accounts
	private int debitCardNumber;
	private int debitCardPin;
	
	//constructor to initialize checking accounts properties
	public CheckingAccount(String name, String socialSecurityNumber, double initDeposit) {
		super(name, socialSecurityNumber, initDeposit);
		accountNumber = "2" + accountNumber;
		
	}
	
	//list methods specific to checking accounts
	
	public void showInfo() {
		super.showInfo();
		System.out.println("checking");
	}

}
