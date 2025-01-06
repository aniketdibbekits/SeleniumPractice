package Logical_Problems;

public class RemoveDigitFromString {
	public static void main(String[] args) {
		String string = "anik123nsh23ku";
		String str = " ";
		for(int i=0;i<string.length()-1;i++) {
			char s1 = string.charAt(i);
			if(!Character.isDigit(s1)) {
				str = str+s1;
			}
		}
		System.out.print(str+" ");
	}

}
