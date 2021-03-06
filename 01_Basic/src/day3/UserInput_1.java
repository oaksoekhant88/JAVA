package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput_1 {
	
	public static void main(String[] args) throws IOException {
		//create bufferedReader stream
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter name: ");
		String name = reader.readLine();
		
		System.out.print("Enter salary: ");
		double salary = Double.parseDouble(reader.readLine()); // string -> double
		
		System.out.print("Enter age: ");
		int age = Integer.parseInt(reader.readLine()); // string -> integer
		
		reader.close(); //close the stream
		
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
		System.out.println("Age: " + age);
	}

}
