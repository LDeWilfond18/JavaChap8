package Exercises;

import java.util.Scanner;

public class DistanceFromAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] arrayNums = new double [20];
		int quit = 0;
		Scanner input = new Scanner(System.in);
		
		while(quit != 99999) {
		for(int i = 0; i < arrayNums.length; i++) {
			System.out.println(" Enter a number or 99999 to quit >> ");
			arrayNums[i] = input.nextDouble();
			System.out.print(arrayNums[i]);
			quit = input.nextInt();
		}
		}
		
	}

}
