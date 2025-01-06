package Logical_Problems;

public class Reverse_String {
	public static void main(String[] args) {
		String str = "My name is Aniket";
		String [] arr = str.split("");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
		}
	}

}
