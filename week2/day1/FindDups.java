package week2.day1;

import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) {
		int[] Arr= {3,6,2,8,5,2,7,1,8,6};
		Arrays.sort(Arr);
		int[] SortArr = Arr;
		System.out.println("Sorted Array" +Arrays.toString(SortArr));
		int len=Arr.length;
		for(int i=0;i<len-1;i++) {
			if (SortArr[i]==SortArr[i+1])
				System.out.println(SortArr[i]+ " is a duplicate");
		}

	}

}
