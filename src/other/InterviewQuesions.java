package other;

public class InterviewQuesions {

	public static int getSumOfNumFromStr(String str) {
		int sum = 0;
		for (char eachChar : str.replaceAll("[^0-9]", "").toCharArray()) {
			sum += ((int) eachChar) - '0';
		}
		return sum;
	}

	public static void main(String[] args) {
		String str1 = "page 44 of 99";
		System.out.println(getSumOfNumFromStr(str1));
	}
}
