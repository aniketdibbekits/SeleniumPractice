package Logical_Problems;

public class Palindrom_Of_Number {
	public static void main(String[] args) {
		int num = 14541;
		int sum = 0;
		int n = num;
		int rem = 0;
		while(n>0)
		{
			rem = n%10;
			sum = sum*10+rem;
			n = n/10;
			
		}
		if(sum==num) {
			System.out.println("The given number is palindrom");
		}
		else {
			System.out.println("The given number is not palindrom");
		}
	}

}
