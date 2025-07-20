package SeleTest;

public class ToUpper {

	public static void main(String[] args) {
		String word = "changeme" ;	
		StringBuilder result = new StringBuilder();
		
		for (int i=0; i<word.length();i++) {
			char ch = word.charAt(i);
			if(i%2==0) 
				result.append(Character.toUpperCase(ch));
			else
				result.append(ch);
			}

	System.out.println("Result "+result.toString());

	}

}
