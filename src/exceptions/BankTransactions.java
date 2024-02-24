package exceptions;

import exceptions.BankTransactionException;

public class BankTransactions {
	
	static int balance = 100000;

	public void deposit(String accountType, int depositAmt) throws BankTransactionException {
		switch (accountType) {
		case "SAVINGS":
			if (depositAmt <= 200000) {
				balance += depositAmt; // balance = balance + depositAmt;
			} else {
				throw new BankTransactionException("Deposit amount exceeded the daily limit 200000");
			}
			break;
		case "CURRENT":
			if (depositAmt <= 500000) {
				balance += depositAmt; // balance = balance + depositAmt;
			} else {
				throw new BankTransactionException("Deposit amount exceeded the daily limit 500000");
			}
			break;
		case "RETAIL":
			if (depositAmt <= 200000) {
				balance += depositAmt; // balance = balance + depositAmt;
			} else {
				throw new BankTransactionException("Deposit amount exceeded the daily limit 1000000");
			}
			break;
		default:
			throw new BankTransactionException("Select Correct account");
		}
	}

	public void withdrawl(int withdrawlAmt) throws BankTransactionException {

		if (withdrawlAmt < balance) {
			if (withdrawlAmt < 50000) {
				balance -= withdrawlAmt; // balance = balance - withdrawlAmt;
			} else {
				throw new BankTransactionException("Withdrawl amount exceeded the daily limit 50000");
			}
		} else {
			throw new BankTransactionException("In-sufficient Balance");
		}

	}

	public static void checkBalance() {
		System.out.println("Balance: " + balance);
	}


}
