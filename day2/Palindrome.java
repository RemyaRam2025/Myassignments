package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		 int input=1232;
		 int output=0;
		 int num =input;
		 
		 while(num!=0) {
			 int digit = num%10;
			 output=output*10+digit;
			num=num/10;
		 }
		 if(input==output)
			 System.out.println(input+ " is a palindrome");
		 else
			 System.out.println(input+ " is not a palindrome");	 
		 
	}

}
