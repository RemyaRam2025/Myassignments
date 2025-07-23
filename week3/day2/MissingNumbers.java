package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingNumbers {

	public static void main(String[] args) {
		Integer[] arr = {1, 2, 3, 4, 10, 6, 8};

        // Convert array to list
        List<Integer> numberList = Arrays.asList(arr);

        // Find min and max
        int min = Collections.min(numberList);
        int max = Collections.max(numberList);

        // Store missing numbers
        List<Integer> missingNumbers = new ArrayList<>();

        // Check each number in the range
        for (int i = min; i <= max; i++) {
            if (!numberList.contains(i)) {
                missingNumbers.add(i);
            }
        }

        System.out.println("Missing numbers: " + missingNumbers);
    }

}
