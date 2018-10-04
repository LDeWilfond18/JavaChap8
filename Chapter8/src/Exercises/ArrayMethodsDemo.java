package Exercises;

public class ArrayMethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrayNums = {1, 2 , 3, 4, 5, 6, 7, 8, 9, 10};
		
		
		displayIntegers(arrayNums);
		reverseIntegers(arrayNums);
		displaySum(arrayNums);
		displayAverage(arrayNums);
	}
	public static void displayIntegers(int[] arrayNums) {
		for(int i = 0; i < arrayNums.length; i++) {
			System.out.println(arrayNums[i]);
		}
		
	}
	public static void reverseIntegers(int[] arrayNums) {
		for(int j = 9; j >= 0; j--) {
			System.out.println(arrayNums[j]);
		}
	}
	public static void displaySum(int[] arrayNums) {
		int sum = 0;
		for(int x = 0; x < arrayNums.length; x++) {
			sum = sum + arrayNums[x];
			
		}
		System.out.println("The sum is " + sum);
	}
	public static void displayAverage(int[] arrayNums) {
		int average = 0;
		int sum = 0; 
		for(int a = 0; a < arrayNums.length; a++) {
			sum = sum + arrayNums[a];
			
		}
		average = sum / 10;
		System.out.println("The average is " + average);
	}
}
















