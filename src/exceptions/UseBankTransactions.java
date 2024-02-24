package exceptions;

public class UseBankTransactions {

	public static void main(String[] args) throws BankTransactionException {

		BankTransactions iciciBank = new BankTransactions();

		try {
			iciciBank.deposit("SAVINSG", 30000);

			iciciBank.withdrawl(5000);

			iciciBank.checkBalance();

		} catch (Exception be) {
		}

	}

}
