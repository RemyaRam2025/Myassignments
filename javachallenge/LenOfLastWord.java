package javachallenge;

import java.util.Scanner;

/*Given a string consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.*/

public class LenOfLastWord {
	
	public static int lengthOfLastWord(String sentence) {
		String[] words = sentence.trim().split("\\s+");
		String lastword = words[words.length-1];
		return lastword.length();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a sentence ");
		String input = scanner.nextLine();
		int length = lengthOfLastWord(input);
		System.out.println("Length of the last word "+length);
		scanner.close();

	}

}
