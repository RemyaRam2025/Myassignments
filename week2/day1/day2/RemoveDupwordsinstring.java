package SeleTest;

public class RemoveDupwordsinstring {

	public static void main(String[] args) {
		String sentence = "We learn Java basics as part of java sessions in java week1";
		String[] words= sentence.split(" ");
		String result=" ";
		for (int i =0;i<words.length;i++) {
			for (int j=i+1; j<words.length;j++) {
				if(words[i].equalsIgnoreCase(words[j])) {
						words[j]="remove";	
				}
			}
		}
		
		for (int i=0;i<words.length;i++) {
			if(words[i]!="remove")
				result=result+words[i]+" ";
		}
		System.out.println("Output "+result);
	}

}

 