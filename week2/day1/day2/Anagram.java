package SeleTest;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String word1 = "listen";
		String word2 = "silent";
		if(checkAnagram(word1,word2)) 
			System.out.println("The words are anagrams");
			else
				System.out.println("The words are not anagrams");
	}
	
	public static boolean checkAnagram(String s1, String s2) {
		if(s1.length()!=s2.length())
			return false;
		
		char[] arr1=s1.toCharArray();
		char[] arr2=s2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		return Arrays.equals(arr1, arr2);
	}

}
