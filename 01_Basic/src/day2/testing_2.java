package day2;

import java.util.Scanner;

public class testing_2 {
	
	// const var
	static final float RATE = 1.5f; // f word for float var
	static final int MIN_PRICE = 1000;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter price: ");
		int price = sc.nextInt();
		if(price < MIN_PRICE)
			price = MIN_PRICE;
		
		System.out.println("Expense: " + (price * RATE));
	}

}
