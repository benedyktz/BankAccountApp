package bankaccountapp;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CheckingAccount checkingAccount1 = new CheckingAccount("aa bb", "12345678", 1500);
		
		SavingsAccount savingsAccount1 = new SavingsAccount("cc dd", "87654321", 2000);
		
		savingsAccount1.showInfo();
		System.out.println("***************");
		checkingAccount1.showInfo();
		
		savingsAccount1.deposit(100);
		savingsAccount1.withdraw(200);
		savingsAccount1.transfer("aa", 12);
		
		checkingAccount1.deposit(10);
		checkingAccount1.withdraw(100);
		checkingAccount1.transfer("adasd", 20);
		
		
		savingsAccount1.compound();
		// Read a csv file and create accounts based on that data

	}

}
