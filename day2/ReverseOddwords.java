package SeleTest;

public class ReverseOddwords {

	public static void main(String[] args) {
		
		String input = "java is simple programming language";
		String output=Rev(input);
		System.out.println("Output "+output);
		
		}
		
		public static String Rev(String input) {
			String[] words= input.split(" ");
			for (int i =0;i<words.length;i++) {
				if((i+1) %2 !=0) {
				words[i]= new StringBuilder(words[i]).reverse().toString();
			}
		}
			return String.join(" ", words);

	}

}
