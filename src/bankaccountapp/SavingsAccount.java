package bankaccountapp;

public class SavingsAccount extends Account {
	
	//list properties specific to savings accounts
	private int safetyDpositBoxId;
	private int safetyDepositBoxKey;
	
	//constructor to initialize saving accounts properties
	public SavingsAccount(String name, String socialSecurityNumber, double initDeposit) {
		super(name, socialSecurityNumber, initDeposit);
		accountNumber = "1" + accountNumber;
		System.out.println(accountNumber);
	}
	
	//list methods specific to savings accounts

}
