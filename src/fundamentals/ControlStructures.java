package fundamentals;

public class ControlStructures {

	static int balance = 100000;

	public void deposit(String accountType, int depositAmt) {
		switch (accountType) {
		case "SAVINGS":
			if (depositAmt <= 200000) {
				balance += depositAmt; // balance = balance + depositAmt;
			} else {
				System.out.println("Deposit amount exceeded the daily limit 200000");
			}
			break;
		case "CURRENT":
			if (depositAmt <= 500000) {
				balance += depositAmt; // balance = balance + depositAmt;
			} else {
				System.out.println("Deposit amount exceeded the daily limit 500000");
			}
			break;
		case "RETAIL":
			if (depositAmt <= 200000) {
				balance += depositAmt; // balance = balance + depositAmt;
			} else {
				System.out.println("Deposit amount exceeded the daily limit 1000000");
			}
			break;
		default:
			System.out.println("Select Correct account");
			break;
		}
	}

	public void withdrawl(int withdrawlAmt) {

		if (withdrawlAmt < balance) {
			if (withdrawlAmt < 50000) {
				balance -= withdrawlAmt; // balance = balance - withdrawlAmt;
			} else {
				System.out.println("Withdrawl amount exceeded the daily limit 50000");
			}
		} else {
			System.out.println("Insufficient Balance");
		}

	}

	public static void checkBalance() {
		System.out.println("Balance: " + balance);
	}

	public static void main(String[] args) {

		ControlStructures ameerpetBranch = new ControlStructures();

		ameerpetBranch.deposit("CURRENT",500000);

		ameerpetBranch.deposit("SAVINGS",50000);
		ControlStructures.checkBalance();

		ControlStructures kotiBranch = new ControlStructures();

		kotiBranch.withdrawl(60000);
		kotiBranch.withdrawl(250000);
		ControlStructures.checkBalance();

	}

}
