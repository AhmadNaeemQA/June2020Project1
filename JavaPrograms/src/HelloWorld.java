
import java.util.Scanner;

public class HelloWorld {

	interface PrintInterface {
		void output();
	}

	public static void helloworld() {
		PrintInterface pF1 = () -> {
			System.out.println("Hello World!");
		};
		pF1.output();
	}

	public static int calculator() {
		Scanner x = new Scanner(System.in);

		System.out.print("Would you like to add, multiply divide?");
		String operator = x.nextLine();

		System.out.println("Choose a number:");
		int firstNum = x.nextInt();

		System.out.println("Choose a second number:");
		int secondNum = x.nextInt();

		int result = -1;
		if (operator.equalsIgnoreCase("add")) {
			result = firstNum + secondNum;
		} else if (operator.equalsIgnoreCase("multiply")) {
			result = firstNum * secondNum;
		} else if (operator.equalsIgnoreCase("divide")) {
			result = firstNum / secondNum;
		} else {
			System.out.println("Unknown input");
			result = calculator();
		}
		x.close();
		return result;
	}

	public static void try_catch() throws ArithmeticException {
		try {
			int num = (10 / 0);
			System.out.println(num);
		} catch (ArithmeticException e) {
			System.out.println("Error occured ");
		} finally {
			System.out.println("This will print");
		}
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("1) Hello World");
		System.out.println("2) Calculator");
		System.out.println("3) Excpetion Handling");
		int option = 0;

		do {
			System.out.println("Which method do you want to run by selecting the corrisponding number: ");

			while (!s.hasNextInt()) {
				System.out.println("Thats not a number! Try again: ");
				s.next();

			}
			option = s.nextInt();
		} while (option < 0 || option > 3);
		s.close();

		switch (option) {
		case (1):
			helloworld();
			break;

		case (2):
			System.out.println(calculator());
			break;

		case (3):
			try_catch();
			break;
		}
	}
}