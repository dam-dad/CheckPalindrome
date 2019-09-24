package dad.javafx.palindrome;

public class Palindrome {
	
	public static boolean check(String inputString) {
		String first = inputString.substring(0, inputString.length() / 2);
		String last = inputString.substring((inputString.length() / 2) + (inputString.length() % 2), inputString.length());
		last = new StringBuffer(last).reverse().toString();
		return last.equals(first);
	}

}
