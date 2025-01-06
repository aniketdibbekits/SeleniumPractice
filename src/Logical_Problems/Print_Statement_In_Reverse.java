package Logical_Problems;

public class Print_Statement_In_Reverse {
	public static void main(String[] args) {
		String str = "My name is aniket";
		String[] arr = str.split(" ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}

}
