package ggg;

public class SavingsAccount extends Account {

	SavingsAccount() {
	}

	SavingsAccount(int id, double balance) {
		super(id, balance);
	}

	public void withdraw(double x) {
		if (x > super.getbalance()) {
			System.out.println("Balance too low.");
			
		}else if (x < 0) {
			System.out.println("Incorrect value.");
			
		}else {
		super.setbalance(super.getbalance() - x);
		}
		
	}

	public String toString() {
		return super.toString() + "\nSavings Account";
	}
}