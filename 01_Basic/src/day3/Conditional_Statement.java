package day3;

import java.util.Scanner;

public class Conditional_Statement {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter language name: ");
		String input = sc.nextLine();
		
		if(input.equalsIgnoreCase("java")) // Java = java
			System.out.println("Best Programming Language");
		
		sc.close();
	}

}
