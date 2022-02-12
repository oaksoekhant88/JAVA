package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput_1 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name: ");
		String name = reader.readLine();
		System.out.print("Enter salary: ");
		double salary = Double.parseDouble(reader.readLine()); // string -> int
		System.out.println("Enter age: ");
		int age = Integer.parseInt(reader.readLine());
	}

}
