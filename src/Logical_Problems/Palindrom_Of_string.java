package Logical_Problems;

public class Palindrom_Of_string {
	public static void main(String[] args) {
		String orginal = "madram";
		String rev = "";
		for(int i=orginal.length()-1;i>=0;i--) {
			rev = rev+orginal.charAt(i);
			
		}
		if(orginal.equals(rev))
		{
			System.out.println("the givrn string is palindrom");
		}
		else {
			System.out.println("The given string is not palindrom");
		}
	}

}
