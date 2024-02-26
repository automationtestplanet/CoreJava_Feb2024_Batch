package exceptions;

public class BankTransactionException extends Exception{
	
	public BankTransactionException(String message){
		System.out.println(message);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	@Override
	public String getMessage() {
		return super.getMessage();
	}
	
	@Override
	public void printStackTrace() {
		super.printStackTrace();
	}

}
