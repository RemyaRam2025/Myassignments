package SeleTest;

public class FindOcc {

	public static void main(String[] args) {
		String word = "Testleaf";
		char ch='e';
		int count = 0;
		
		for (int i=0;i<word.length();i++) {
			if(word.charAt(i)==ch) {
				count=count+1;
			}
		}
		System.out.println("Count of "+ch+" in "+word+" is "+count);
		
	}

}
