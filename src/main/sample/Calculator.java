package main.sample;

import java.util.Scanner;

public class Calculator {


	public void start() {

		do {
			menu();

			String firstNumber = readInput("Please write the first number: ");
			if (firstNumber.equalsIgnoreCase("q")) {
				break;
			}

			String operation = readInput("Please choose operation: ");
			if (operation.equalsIgnoreCase("q")) {
				break;
			}

			String secondNumber = readInput("Please write the second number: ");
			if (secondNumber.equalsIgnoreCase("q")) {
				break;
			}

			System.out.println("Your current value is: " + calculate(firstNumber, operation, secondNumber));
		} while (true);
		System.out.println("Bye");
	}

	public void menu() {
		System.out.println("Please enter two integer numbers and an operation:");
		System.out.println("+ Add");
		System.out.println("- Deduct");
		System.out.println("* Multiply");
		System.out.println("/ Divide");
		System.out.println("Q Quit");

	}

	public String readInput(String message) {
		System.out.print(message);

		return (new Scanner(System.in)).nextLine();
	}

	public int readNumber(String message) {

		int result = 0;
		boolean isValid = false;

		do {
			try {
				result = Integer.valueOf(readInput(message));

				isValid = true;
			} catch (NumberFormatException e) {
				System.out.println("Invalid number, please enter valid number");
			}
		} while (!isValid);

		return result;
	}

	public int calculate(String firstNumber, String operation, String secondNumber) {
		int firstNumberInt;
		int secondNumberInt;
		int result=0;
		
		try {
			firstNumberInt = Integer.valueOf(firstNumber);
		} catch (NumberFormatException e) {
			System.out.println("Invalid first number, please enter valid number");
			return 0;
		}
		try {
			secondNumberInt = Integer.valueOf(secondNumber);
		} catch (NumberFormatException e) {
			System.out.println("Invalid second number, please enter valid number");
			return 0;
		}
		switch (operation) {
		case "+":
			result = firstNumberInt+secondNumberInt;
			break;
		case "-":
			result =firstNumberInt-secondNumberInt;
			break;
		case "*":
			result =firstNumberInt*secondNumberInt;
			break;
		case "/":
			result =firstNumberInt/secondNumberInt;
			break;
		default:
			System.out.println("Invalid operation");
		}
		return result;
	}
}
