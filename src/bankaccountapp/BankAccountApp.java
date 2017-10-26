package bankaccountapp;

import java.util.List;

import utilities.CsvReader;

public class BankAccountApp {

	public static void main(String[] args) {
		
		String fileName = "NewBankAccounts.csv";
		
		List<String[]> newCustomers = CsvReader.read(fileName);
		
		for(String[] customer : newCustomers) {
			System.out.println(customer[0]);
			System.out.println(customer[1]);
			System.out.println(customer[2]);
			System.out.println(customer[3]);
		}
		
//		CheckingAccount checkingAccount1 = new CheckingAccount("aa bb", "12345678", 1500);
//		
//		SavingsAccount savingsAccount1 = new SavingsAccount("cc dd", "87654321", 2000);
//		
//		savingsAccount1.showInfo();
//		System.out.println("***************");
//		checkingAccount1.showInfo();
//		
//		savingsAccount1.deposit(100);
//		savingsAccount1.withdraw(200);
//		savingsAccount1.transfer("aa", 12);
//		
//		checkingAccount1.deposit(10);
//		checkingAccount1.withdraw(100);
//		checkingAccount1.transfer("adasd", 20);
//		
//		
//		savingsAccount1.compound();

	}

}
