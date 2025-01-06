package Logical_Problems;

public class Reverse_Each_WOrd_in_Statement {
	public static void main(String[] args) {
		String str = "My name is ANiket";
		String[] string = str.split(" ");
		
		for(int i=0;i<string.length;i++) {
			String org = string[i];
			String revStr = " ";
			for(int j=org.length()-1;j>=0;j--) {
				revStr = revStr+org.charAt(j);
				
			}
			System.out.print(revStr+" ");
		}
	}

}
