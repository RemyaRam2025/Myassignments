package week2.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class intersection {

	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(3,2,11,4,6,7);
		List<Integer> list2 = Arrays.asList(1,2,8,4,9,7);
		
		List<Integer> intersec = new ArrayList<>();
		
		for(Integer num:list1) {
			if(list2.contains(num) && !intersec.contains(num)) {
				intersec.add(num);
			}
		}
		
		System.out.println("Intersection " +intersec);
	}

}
