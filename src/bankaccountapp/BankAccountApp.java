package bankaccountapp;

import java.util.ArrayList;
import java.util.List;

import utilities.CsvReader;

public class BankAccountApp {

	public static void main(String[] args) {
		
		List<Account> accounts = new ArrayList<Account>();
		
		
		String fileName = "NewBankAccounts.csv";
		
		List<String[]> newCustomers = CsvReader.read(fileName);
		
		for(String[] customer : newCustomers) {
			String name = customer[0];
			String socialSecurityNumber = customer[1];
			String accountType = customer[2];
			double initDeposit = Double.parseDouble(customer[3]);
			
			if(accountType.equals("Savings")) {
				accounts.add(new SavingsAccount(name, socialSecurityNumber, initDeposit));
			}
			else if(accountType.equals("Checking")) {
				accounts.add(new CheckingAccount(name, socialSecurityNumber, initDeposit));
			}
			else {
				System.out.println("error, wrong account type");
			}
		}
		
		for(Account acc : accounts) {
			acc.showInfo();
			System.out.println("\n");
		}

	}

}
