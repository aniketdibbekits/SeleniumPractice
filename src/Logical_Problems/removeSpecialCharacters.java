package Logical_Problems;

public class removeSpecialCharacters {
	public static void main(String[] args) {
		String str = "ja&%$v#va&%$675";
		String newStr = str.replaceAll("[^a-zA-Z]", "");
		System.out.println(newStr);
	}

}
