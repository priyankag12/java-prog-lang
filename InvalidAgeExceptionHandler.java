package exception;

import java.util.Scanner;

public class InvalidAgeExceptionHandler {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Age : ");
		int age = sc.nextInt();
		try {
			checkAgeHandler(age);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void checkAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("oii bachelor kal aana");
		}else {
			System.out.println("Welcome sir welcome");
		}
	}
	
	static void checkAgeHandler(int age) throws InvalidAgeException {
		checkAge(age);
	}
	
}

class InvalidAgeException extends Exception{
	
	public InvalidAgeException(String message) {
		super(message);
	}
		
}