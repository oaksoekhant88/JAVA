package day2;

public class testing_3 {
	
	public static void main(String[] args) {
		int a = 200;
		long b = a; // implicit
		
		double c = a; // implicit
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
		System.out.println("*******");
		double d = 57.17;
		int e = (int)d; // explicit
		
		long f = 1000;
		int g = (int)f;
		
		System.out.println("d = " + d);
		System.out.println("e = " + e);
		System.out.println("g = " + g);
	}

}
