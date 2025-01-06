package Logical_Problems;

public class Reverse_odd_Index_Words {
	public static void main(String[] args) {
		String string = "My name is aniket";
		String[] arr = string.split(" ");
		for(int i=0;i<arr.length;i++) {
			String org = arr[i];
			if(i%2==0) {
				String reverse = reverString(org);
				System.out.print(reverse+" ");
			}
			else {
				System.out.print(org+" ");
			}
		}
	}
	public static String reverString(String org) {
		String rev = " ";
		for(int j=org.length()-1;j>=0;j--) {
			rev = rev+org.charAt(j);
		}
		return rev;
		
		
	}

}
