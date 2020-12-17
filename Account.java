package ggg;

import java.util.Date;
public class Account {
private int id=0;
private double balance=0, yearInterestRate=0;	
private Date dateCreated=new Date();
Account(){}
Account(int id,double balance){
	this.id=id;
	this.balance=balance;
}
public int getid() {
	return this.id;
}
public double getbalance() {
	return this.balance;
}
public double getYIR() {
	return this.yearInterestRate/100;
}
public void setid(int id) {
	this.id=id;
}
public void setbalance(double b) {
	this.balance=b;
}
public void getbalance(double b) {
	this.balance=b;
}
public void getYIR(double a) {
	this.yearInterestRate=a;
}
public double getMonthlyInterestRate() {
	return this.yearInterestRate/12;
	
}
public double getMonthlyInterest() {
	return this.balance * this.getMonthlyInterestRate();
	
}
public void withdraw(double i) {
	if(i<=this.balance) {
		this.balance-=i;
	}
}
public void deposit(double i) {
		this.balance+=i;

}
}
