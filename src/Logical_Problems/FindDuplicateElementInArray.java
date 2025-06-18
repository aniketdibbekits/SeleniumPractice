package Logical_Problems;

public class FindDuplicateElementInArray {
	public static void main(String[] args) {
//		String names[] = {"a","b","c","d","a"};
//		for(int i=0;i<names.length;i++) {
//			for(int j=i+1;j<names.length;j++) {
//				if(names[i].equals(names[j])) {
//					System.out.println("Duplicate is "+names[i]);
//				}
//			}
//		}
		
		int numbers[]= {1,2,3,4,3,4};
		for(int i=0;i<numbers.length;i++) {
			for(int j=i+1;j<numbers.length;j++) {
				if(numbers[i]==numbers[j]) {
					System.out.println("duplicate number is "+numbers[i]);
				}
			}
		}
	}

}
