package week3.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseList {

	public static void main(String[] args) {
		String[] companies = { "HCL", "Wipro", "Aspire Systems", "CTS" };

        // Convert array to list
        List<String> companyList = Arrays.asList(companies);

        // Sort the list in ascending order
        Collections.sort(companyList);
        System.out.println("Sorted List: " + companyList);

        // Reverse the sorted list
        System.out.println("Output");
        int size=companyList.size();
        for (int i =size-1;i>=0;i--) {
            System.out.println(companyList.get(i));
	}

}
}
