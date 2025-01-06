package Logical_Problems;

public class Count_Vovels_Consonant {
	public static void main(String[] args) {
		String string = "This is my laptop";
		int vcount = 0;
		int Ccount = 0;
		int CharCount = 0;
		String str = string.toLowerCase();
		//for character count
		
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				CharCount++;
			}
			else if(str.charAt(i)=='a' ||str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u' ) {
				vcount++;
			}
			else if(str.charAt(i)>='a'&& str.charAt(i)<='z'){
				Ccount++;
			}
		}
		System.out.println("character count"+CharCount);
		System.out.println("vovwels count" + vcount);
		System.out.println("Consonant count" + Ccount);
			}

}
