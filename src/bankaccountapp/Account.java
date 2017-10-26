package bankaccountapp;

import java.math.BigDecimal;

public abstract class Account implements IBaseRate {
	
	private String name;
	private String socialSecurityNumber;
	protected String accountNumber;
	private double balance;
	protected double rate;
	
	private static int uniqueFiveDigitNumber = 10000;
	
	public Account(String name, String socialSecurityNumber, double initDeposit) {
		this.name = name;
		this.socialSecurityNumber = socialSecurityNumber;
		this.balance = initDeposit;
		
		setAccountNumber();
		
		System.out.println(getBaseRate());
		
		setRate();
		
		uniqueFiveDigitNumber++;
	}
	
	public abstract void setRate();
	
	private void setAccountNumber() {
		accountNumber = socialSecurityNumber.substring(socialSecurityNumber.length()-2);
		accountNumber += uniqueFiveDigitNumber;
		accountNumber += generateThreeRandomNumber();
	}
	
	public void compound() {
		double accruedInterest = balance * (rate/100);
		balance = balance + accruedInterest;
		System.out.println("Accrued interest " + accruedInterest);
	}
	
	protected String generateThreeRandomNumber() {
		String randomThreeDigits = "";
		for(int i=0; i<3; i++) {
			int randomDigit = (int) Math.floor((Math.random() * 10));
			randomThreeDigits += randomDigit;
		}
		return randomThreeDigits;
	}
	
	public void showInfo() {
		System.out.println(name + " " + accountNumber + " $" + balance);
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Depositing $" + amount);
		printBalance();
	}
	
	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Withdrawing $" + amount);
		printBalance();
	}
	
	public void transfer(String toWhere, double amount) {
		balance = balance - amount;
		System.out.println("transfering $" + amount + " to " + toWhere);
		printBalance();
	}
	
	public void printBalance() {
		System.out.println("Balance is: " + balance);
	}
	
}
