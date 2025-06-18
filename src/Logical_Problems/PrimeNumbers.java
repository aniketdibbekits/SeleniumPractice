package Logical_Problems;

public class PrimeNumbers {
	public static void main(String[] args) {
		int start = 1;
		int end = 100;
		for(int i=start;i<end;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
	}
	
	static boolean isPrime(int n) {
		if(n<2) {
			return false;
		}
		for(int i=2;i<n;i++) {
			if(n%i ==0) {
				return false;
			}
		}
		return true;
		
	}

}
