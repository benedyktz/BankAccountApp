package bankaccountapp;

import java.math.BigDecimal;

public abstract class Account implements IBaseRate {
	//common properties for savings and checking accounts
	
	
	private String name;
	private String socialSecurityNumber;
	private String accountNumber;
	private double balance;
	private double rate;
	
	private static int uniqueFiveDigitNumber = 10000;
	
	//constructor to set base properties
	public Account(String name, String socialSecurityNumber, double initDeposit) {
		this.name = name;
		this.socialSecurityNumber = socialSecurityNumber;
		this.balance = initDeposit;
		System.out.println(name + " " + socialSecurityNumber + " " + initDeposit);
		
		setAccountNumber();
		
		
		
		uniqueFiveDigitNumber++;
	}
	
	private void setAccountNumber() {
		String accountNumber = socialSecurityNumber.substring(socialSecurityNumber.length()-2);
		accountNumber += uniqueFiveDigitNumber;
		accountNumber += generateThreeRandomNumber();
		System.out.println(accountNumber);
		
	}
	
	private String generateThreeRandomNumber() {
		String randomThreeDigits = "";
		for(int i=0; i<3; i++) {
			int randomDigit = (int) Math.floor((Math.random() * 10));
			randomThreeDigits += randomDigit;
		}
		return randomThreeDigits;
	}
	
	//list common methods

}
