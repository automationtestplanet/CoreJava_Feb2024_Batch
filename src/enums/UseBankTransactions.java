package enums;

public class UseBankTransactions {

	public static void main(String[] args) throws BankTransactionException {

		BankTransactions iciciBank = new BankTransactions();

		try {
			iciciBank.deposit(AccountTypes.SAVINGS, 30000);

			iciciBank.withdrawl(5000);

			iciciBank.checkBalance();
			
			iciciBank.deposit(AccountTypes.RETAIL, 300000);
			
			iciciBank.checkBalance();
			
		} catch (Exception be) {
		}

	}

}
