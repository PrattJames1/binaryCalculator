import java.util.*;

public class BinaryCalculator {
	public static Scanner scan = new Scanner(System.in);
	public static int mode, decimalNumber;
	public static List<Integer> binaryNumber = new ArrayList<>();

	public static void main (String args[]) {
		start();
	}

	public static void start() {
		System.out.println("Would you like to convert to decimal, or binary?\n" +
			"Type 0 if decimal, 1 if binary.");
		mode = scan.nextInt();
		if (mode == 0)
			calculateDecimal();
		else
			calculateBinary();
	}

	public static void calculateDecimal() {
		System.out.println("Please enter the binary number you would like to convert: ");
		int number = scan.nextInt();

		String numberAsString = Integer.toString(number);
		int decimalNumber = Integer.parseInt(numberAsString, 2);
		System.out.println(decimalNumber);
	}

	public static void calculateBinary() {
		System.out.println("Please enter the decimal number you would like to convert: ");
		int number = scan.nextInt();

		while (number != 0) {
			if (number % 2 == 1) {
				binaryNumber.add(0, 1);
			}
			else {
				binaryNumber.add(0, 0);
			}
			number = (number / 2);
		}

		StringBuilder sb = new StringBuilder();
		for (int i = binaryNumber.size() - 1; i >= 0; i--) {
			int num = binaryNumber.get(i);
			sb.append(num);
		}
		String result = sb.reverse().toString();

		System.out.println(result);
	}
}