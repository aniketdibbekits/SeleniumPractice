package Logical_Problems;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String str1 = "RACE";
		String str2 = "CARE";
		
		
		
		if(str1.length()==str2.length()) {
			char[] charArray1 = str1.toCharArray();
			char[] charArray2 = str2.toCharArray();
			
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			
			boolean res = Arrays.equals(charArray1, charArray2);
			if(res) {
				System.out.println("This is agangram");
			}
			
		}
		else {
			System.out.println("The given strings are not anagram");
		}
	}

}
