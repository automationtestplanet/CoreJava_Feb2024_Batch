package fundamentals;

public class BankTransactions {
	
	static int balance = 100000;

	public void deposit(int depositAmt) {
		balance += depositAmt; // balance = balance + depositAmt;
	}

	public void withdrawl(int withdrawlAmt) {
		balance -= withdrawlAmt; // balance = balance - withdrawlAmt;
	}

	public static void checkBalance() {
		System.out.println("Balance: " + balance);
	}

	public static void main(String[] args) {
		
		BankTransactions ameerpetBranch = new BankTransactions();
		
		ameerpetBranch.deposit(50000);
		BankTransactions.checkBalance();
		
		BankTransactions kotiBranch = new BankTransactions();
		
		kotiBranch.withdrawl(25000);
		BankTransactions.checkBalance();

	}

}
