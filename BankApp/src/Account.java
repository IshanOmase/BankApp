/*
6:create BankAccount application for operations like withdraw ,deposite  and moneyTransfer.
Create menu drive program for bank operations,balance,email...
*/

package BankAccount;

public class Account {
	private int accNo;
	private double balance;
	private String name, email;
	
	public Account() {
		System.out.println("Default Constructor. Enter valid data to select/create an account.");
	}
	public Account(int accNo, String name, String email, double balance) {
		//super();
		this.accNo = accNo;
		this.name = name;
		this.email = email;
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public int getAccNo() {
		return accNo;
	}
	
	public boolean withdraw(double amt) {
		if(amt > balance) {
			return false;
		}else {		
		this.balance -= amt;
		return true;
		}
	}
	
	public double deposit(double amt) {
		this.balance = this.balance + amt;
		return this.balance;
	}
	
	public void changeEmail(String nEmail) {
		System.out.println("The previous email: "+this.email);
		this.email = nEmail;
		System.out.println("The new email: "+this.email);
	}
	
	public void displayAcc() {
		System.out.println("Account no.: "+accNo);
		System.out.println("Account Holder Name: " + name);
		System.out.println("Holder's email ID: "+ email);
		System.out.println("Account Balance: "+ balance);
	}
	
}

