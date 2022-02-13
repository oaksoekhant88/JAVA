package day3;

import java.util.Scanner;

public class assignment_CountPNZ {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int p = 0, n = 0, z = 0;
		System.out.print("How many numbers you want to type: ");
		int inputCount = sc.nextInt();
		
		for(int i = 0; i < inputCount; i++) {
			System.out.print("Enter any number: ");
			int inputNum = sc.nextInt();
			
			if(inputNum > 0) {
				p++;
			}else if(inputNum < 0) {
				n++;
			}else {
				z++;
			}
		}
		
		System.out.println("Number of Zero: " + z);
		System.out.println("Number of Positive Number: " + p);
		System.out.println("Number of Negative Number: " + n);
		
		sc.close();
	}

}
