package bankaccountapp;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CheckingAccount checkingAccount1 = new CheckingAccount("aa bb", "12345678", 1500);
		
		SavingsAccount savingsAccount1 = new SavingsAccount("cc dd", "87654321", 2000);
		
		savingsAccount1.showInfo();
		checkingAccount1.showInfo();
		
		// Read a csv file and create accounts based on that data

	}

}
