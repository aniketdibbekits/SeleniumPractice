package Logical_Problems;

public class ReverseNum {
	public static void main(String[] args) {
		int num = 1234;
		int sum = 0;
		int rem = 0;
		int n = num;
		while(n>0)
		{
			rem = n%10;
			sum = sum*10+rem;
			n = n/10;
		}
		System.out.println(sum);
	}

}
