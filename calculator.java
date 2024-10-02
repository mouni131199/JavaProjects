package projects;

import java.util.*;

public class Calculator {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double num1, num2, result;
		char operator;
		System.out.print("Enter the forst number:");
		num1 = s.nextDouble();
		System.out.print("Enter the second number:");
		num2 = s.nextDouble();

		System.out.print("Enter an operator(+,-,/,*):");
		operator = s.next().charAt(0);
		switch (operator) {
		case '+': {
			result = num1 + num2;
			System.out.println(num1 + "+" + num2 + "=" + result);
			break;
		}
		case '-': {
			result = num1 - num2;
			System.out.println(num1 + "-" + num2 + "=" + result);
			break;
		}
		case '/': {
			if (num2 == 0) {
				System.out.println("Error:Can not perform division with 0");
			} else {
				result = num1 / num2;
				System.out.println(num1 + "/" + num2 + "=" + result);
				break;
			}
		}
		case '*': {
			result = num1 * num2;
			System.out.println(num1 + "*" + num2 + "=" + result);
			break;
		}
		default:{
			System.out.println("Invalid Operator");
			break;
		}
		}

	}

}
