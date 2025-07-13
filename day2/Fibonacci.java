package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		int num =8;
		int sum=0,x=0,y=1;
		
		for(int i=0;i<num;i++) {
			
			System.out.println(" "+sum);
			sum=x+y;
			x=y;
			y=sum;
			
		}

	}

}
