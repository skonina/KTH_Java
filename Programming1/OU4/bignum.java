import java.util.*; // Scanner
import static java.lang.System.out;
class OperationsWithNaturalNumbersGivenAsStrings {
	public static void main(String[] args) {
		out.println(" OPERATIONS ON NATURAL NUMBERS " +
			" IN CHARACTER STRINGS ");
		// enter two natural numbers
		Scanner in = new Scanner(System. in );
		out.println(" two natural numbers : ");
		String tal1 = in .next();
		String tal2 = in .next();
		out.println();
		// add the numbers and show the result
		String sum = add(tal1, tal2);
		1We here define the natural numbers as zero and the positive integers.
		1
		show(tal1, tal2, sum, â + â);
		// subtract the numbers and show the result
		// *** WRITE YOUR CODE HERE ***
	}
	// The add method accepts two natural numbers represented
	// as character strings and returns their sum as a
	// character string .
	public static String add(String num1, String num2) {
		// *** WRITE YOUR CODE HERE ***
	}
	// The subtract method accepts two natural numbers
	// represented as character strings and returns their
	// difference as a character string .
	// The first number is not smaller than the second
	public static String subtract(String num1, String num2) {
		// *** WRITE YOUR CODE HERE ***
	}
	// The show method presents two natural numbers , an
	// operator and the result string .
	public static void show(String num1, String num2,
	String result, char operator) {
		// set an appropriate length on numbers and result
		int len1 = num1.length();
		int len2 = num2.length();
		int len = resultat.length();
		int maxLen = Math.max(Math.max(len1, len2), len);
		num1 = setLen(num1, maxLen - len1);
		num2 = setLen(num2, maxLen - len2);
		result = setLen(result, maxLen - len);
		// show the expression
		out.println(" " + num1);
		out.println(" " + operator + " " + num2);
		for (int i = 0; i < maxLen + 2; i++)
		out.print(" -");
		out.println();
		out.println(" " + result + " \ n ");
	}
	// The setLen method prepends the supplied number of
	// spaces ato the beginning of a string
	public static String setLen(String s, int nofSpaces) {
		StringBuilder sb = new StringBuilder(s);
		for (int i = 0; i < nofSpaces; i++)
		sb.insert(0, " ");
		2
		return sb.toString();
	}
}
