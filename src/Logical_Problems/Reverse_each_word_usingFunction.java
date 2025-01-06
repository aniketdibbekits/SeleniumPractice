package Logical_Problems;

public class Reverse_each_word_usingFunction {
	public static void main(String[] args) {
		String str = "My name is aniket";
		String[] arr = str.split(" ");
		for(int i=0;i<arr.length;i++) {
			String org = arr[i];
			String rev = reverseString(org);
			System.out.print(rev+" ");

		}
	}
	
	public static String reverseString(String org) {
		String reverse = " ";
		for(int j=org.length()-1;j>=0;j--) {
			reverse = reverse+org.charAt(j);
		}
		return reverse;
		
		
	}

}
