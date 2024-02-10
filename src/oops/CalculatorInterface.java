package oops;


// Abstraction
public interface CalculatorInterface {

	/**
	 * Description: it is to perform addition operation on two number
	 * 
	 * @author RAJU CHELLE
	 * @param a
	 * @param b
	 * @return
	 */
	int addition(int a, int b);

	/**
	 * Description: it is to perform addition operation on two Strings
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	String addition(String a, String b);

	/**
	 * Description: it is to perform addition operation on three number
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	int addition(int a, int b, int c);

	/**
	 * Description: it is to perform subtraction operation on two number
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	int substraction(int a, int b);

	/**
	 * Description: it is to perform multiplication operation on two number
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	int multiplication(int a, int b);

	/**
	 * Description: it is to perform division operation on two number
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	int division(int a, int b);

	/**
	 * Description: it is to perform Modular Division operation on two number
	 * 
	 * @param b
	 * @param a
	 * @return
	 */
	int modDivision(int a, int b);
}
