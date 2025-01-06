package Logical_Problems;

public class Count_white_spaces {
	public static void main(String[] args) {
		String str = "a b c d";
		int count = 0;
		for(int i=0;i<str.length();i++)
		{
			char s1 = str.charAt(i);
			if(s1==' ') {
				count++;
			}
		}
		System.out.println("White spaces are"+count);
	}

}
