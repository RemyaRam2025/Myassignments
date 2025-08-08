package javachallenge;

import java.util.Scanner;

//Given a non-negative integer x, compute and return the square root of x
public class squareRoot {

	public static void main(String[] args) {
		
		System.out.println("Enter number ");
		Scanner scanner = new Scanner(System.in);
		float num = scanner.nextFloat();
		double guess = num / 2;
		for (int i = 0; i < 10; i++) {
	        guess = (guess + num/guess) / 2.0;
	        System.out.println(guess);
	    }
	    System.out.println("The square root "+guess);
	    scanner.close();

	}

}
