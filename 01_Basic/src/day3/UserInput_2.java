package day3;

import java.io.Console;

public class UserInput_2 {
	
	public static void main(String[] args) {
		Console console = System.console(); // get console object
		
		String name = console.readLine("Enter name: "); // read text
		char[] pass = console.readPassword("Enter password: "); // read password
		double salary = Double.parseDouble(console.readLine("Enter salary: "));
		int age = Integer.parseInt(console.readLine("Enter age: "));
		
		System.out.println("Your name is: " + name);
		System.out.println("Password: " + String.valueOf(pass)); // valueOf - convert any datatype to string
		System.out.println("Salary: " + salary);
		System.out.println("Age: " + age);
	}

}
