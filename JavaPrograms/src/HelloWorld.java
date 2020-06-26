
import java.util.Scanner;

public class HelloWorld {
	
	public static String helloworld() {
		return ("Hello World");
	}
	
	public static int calculator() {
		Scanner x = new Scanner(System.in);
		int result = 0;
		System.out.println("Choose a number:");
		int firstNum = x.nextInt();
		System.out.println("Choose a second number:");
		int secondNum = x.nextInt();
		System.out.print("Would you like to add, multiply divide?");
		String operator = x.nextLine();
		System.out.println("You would like to: "+ operator);
		result = firstNum + secondNum;
		if (operator.equalsIgnoreCase("add")) {
			result = firstNum + secondNum;
		}
		else if (operator.equalsIgnoreCase("multiply")) {
			result = firstNum + secondNum;
		}
		else if (operator.equalsIgnoreCase("divide")) {
			result = firstNum + secondNum;
		}
//		else {
//			System.out.println("Unknown input");
//		}
//		
		return result;
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Which method do you want to run by selecting the corrisponding number:");
		System.out.println("1) Hello World");
		System.out.println("2) Calculator");
		int option = s.nextInt();
		
		if (option==1) {
			System.out.println(helloworld());
		}
		
		else if (option==2) {
			System.out.println(calculator());
		}
		

		
//		System.out.println("Hello World!");
//		
//		int a = 10;
//		int b = 20;
//		int c = a+b;
//		System.out.println(c);
//		
//		if (c>10 && a>5) {
//			System.out.println("c is greater than 10 and a is greater than 5");
//		}
//		else if (b>15) {
//			System.out.println("b is greater than 15");
//		}
//		else {
//			System.out.println("Else statement");
//		}
	}

}
