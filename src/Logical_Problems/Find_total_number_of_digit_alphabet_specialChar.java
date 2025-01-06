package Logical_Problems;

public class Find_total_number_of_digit_alphabet_specialChar {
	public static void main(String[] args) {
		String str="--abc 12 @";
		int alphabetCount = 0;
		int specialCharCount = 0;
		int whiteSpaceCount = 0;
		int digitCount = 0;
		int letterCount = 0;
		for(int i=0;i<=str.length()-1;i++) {
			char s1 = str.charAt(i);
			if(Character.isLetter(s1)) {
				letterCount++;
			}
			else if(Character.isDigit(s1)) {
				digitCount++;
			}
			else if(Character.isWhitespace(s1)) {
				whiteSpaceCount++;
			}
			else {
				specialCharCount++;
			}
		}
		System.out.println("letter count"+letterCount);
		System.out.println("digit count"+digitCount);
		System.out.println("white space"+whiteSpaceCount);
		System.out.println("specialChar"+specialCharCount);
	}

}
