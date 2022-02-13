package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class assignment_profileDataInput {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter Full Name: ");
		String fullname = reader.readLine();
		
		System.out.print("Enter Email: ");
		String email = reader.readLine();
		
		System.out.print("Enter Phone: ");
		String phone = reader.readLine();
		
		System.out.print("Enter Education: ");
		String edu = reader.readLine();
		
		System.out.print("Enter Income: ");
		double income = Double.parseDouble(reader.readLine());
		
		System.out.print("Enter Age: ");
		int age = Integer.parseInt(reader.readLine());
		
		reader.close();
		
		System.out.println("Full Name: " + fullname);
		System.out.println("Email: " + email);
		System.out.println("Phone: " + phone);
		System.out.println("Education: " + edu);
		System.out.println("Income: " + income);
		System.out.println("Age: " + age);
	}
	
}
