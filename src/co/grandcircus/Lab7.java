package co.grandcircus;

import java.util.Scanner;

public class Lab7 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Please enter a valid Name: ");
		String userName = scan.next();
		if (isValid(userName, "[A-Z]+[a-zA-Z]*")) {
			System.out.println("Name is valid!");
		} else {
			System.out.println("Sorry, name is not valid!");
		}

		System.out.println("Please enter a valid email: ");
		String eMail = scan.next();
		if (isValid(eMail, "[A-Za-z0-9]{5,30}@[A-Za-z0-9]{5,10}.[a-zA-Z0-9]{1,3}")) {
			System.out.println("Email is valid!");
		} else {
			System.out.println("Email is not valid!");
		}

		System.out.println("Please enter a valid phone number (xxx-xxx-xxxx): ");
		String number = scan.next();
		if (isValid(number, "[0-9]{3}-[0-9]{3}-[0-9]{4}")) {
			System.out.println("Phone number is valid!");
		} else {
			System.out.println("Phone number is not valid!");
		}
		System.out.println("Please enter a valid date (dd/mm/yyyy): ");
		String date = scan.next();
		if (isValid(date, "[0-3]{1}[0-9]{1}/[0-1]{1}[0-2]{1}/[0-9]{4}")) {
			System.out.println("You entered a valid date!");
		} else {
			System.out.println("Date is not valid!");
		}

		scan.close();
	}

	private static boolean isValid(String userInput, String regex) {
		if (userInput.matches(regex)) {
			return true;
		}
		return false;
	}

}
