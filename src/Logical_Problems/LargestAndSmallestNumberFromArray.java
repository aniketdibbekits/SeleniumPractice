package Logical_Problems;

public class LargestAndSmallestNumberFromArray {
	public static void main(String[] args) {
		int numbers[] = {98,23,56,75,2,67,55};
		int smallest = numbers[0];
		int largest = numbers[0];
		
		for(int i=1;i<numbers.length;i++) {
			if(numbers[i]>largest) {
				largest = numbers[i];
			}
			else if(numbers[i]<smallest){
				smallest = numbers[i];
			}
		}
		System.out.println("Largest "+largest);
		System.out.println("Smallest number is"+ smallest);
	}

}
