package Logical_Problems;

public class RemoveDuplicateFromString {
	public static void main(String[] args) {
		String str = "ABCBACBH";
		String result = "";
		
		for(int i=0;i<str.length();i++) {
			String ch = ""+str.charAt(i);
			if(!result.contains(ch)) {
				result = result + ch;
			}
		}
		System.out.println(result);
		
	}

}
