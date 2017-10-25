package bankaccountapp;

public class SavingsAccount extends Account {
	
	//list properties specific to savings accounts
	private int safetyDpositBoxId;
	private int safetyDepositBoxKey;
	
	//constructor to initialize saving accounts properties
	public SavingsAccount(String name, String socialSecurityNumber, double initDeposit) {
		super(name, socialSecurityNumber, initDeposit);
	}
	
	//list methods specific to savings accounts

}
