package week3.day2;

import java.util.Arrays;
import java.util.List;

public class SecondLar {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3, 2, 11, 4, 6, 7);

        int lar = Integer.MIN_VALUE;
        int secondLar = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > lar) {
                secondLar = lar;
                lar = num;                
            } 
            else if (num > secondLar && num != lar) {
                secondLar = num;
            } 
        }

        System.out.println("Second largest number is: " + secondLar);
    }
}

