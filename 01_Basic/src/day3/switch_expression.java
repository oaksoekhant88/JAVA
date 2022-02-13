package day3;

import java.util.Scanner;

public class switch_expression {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter food name: ");
		String name = sc.nextLine();
		String category;
		
//		category = switch(name) {
//			case "burger","pizza","sandwich" -> "FastFood";
//			case "yogurt", "milk tea" -> "Dessert";
//			case "mohingar" -> "Burmese Food";
//			case "sushi" -> "Japanese Food";
//			default -> "Unknown";
//		};
		category = switch(name) {
			case "burger","pizza","sandwich" -> {
				if(name.equals("pizza"))
					System.out.println(name + " is an Italian food");
				yield "FastFood";
			}
			case "yogurt", "milk tea" -> {yield "Dessert";}
			case "mohingar" -> "Burmese Food";
			case "sushi" -> "Japanese Food";
			default -> "Unknown";
		};
		System.out.println(name + " is " + category);
		
		sc.close();
	}

}
