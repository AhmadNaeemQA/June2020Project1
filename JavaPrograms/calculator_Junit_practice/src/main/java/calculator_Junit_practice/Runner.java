package calculator_Junit_practice;

public class Runner {
	public static void main(String[] args) {
		System.out.println(addition(2, 3));
	}

	public static int addition(int a, int b) {
		return a + b;
	}

	public static int subtraction(int a, int b) {
		return a - b;

	}

	public static int division(int a, int b) throws ArithmeticException {
		int result = -1;
		try {
			result = a / b;
			return result;
		} catch (ArithmeticException e) {
			System.out.println("Arithmatic error occured, check inputs");
			return result;
		}

	}

	public static int multiplication(int a, int b) {
		return a * b;
	}
}
