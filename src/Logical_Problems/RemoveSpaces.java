package Logical_Problems;

public class RemoveSpaces {
	public static void main(String[] args) {
        String str = "  j a  v a pro  g   ";
        String newstr = str.replaceAll("\\s","");
        System.out.print(newstr);
	}

}
