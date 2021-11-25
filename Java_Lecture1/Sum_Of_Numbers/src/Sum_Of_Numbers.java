// Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.

import java.util.Scanner;

public class Sum_Of_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int NegativeSum = 0;
		int PositiveEven = 0;
		int PositiveOdd = 0;
		while(number != 0) {
			if(number < 0)
			 NegativeSum+= number;
			else if(number%2 == 0)
				PositiveEven += number;
			else
				PositiveOdd += number;
			number = input.nextInt();
		}
    System.out.println("The sum of the Negative Numbers is " + NegativeSum);
    System.out.println("The sum of the Positive even numbers is " + PositiveEven);
    System.out.println("The sum of the Positive odd numbers is " + PositiveOdd);
	}

}
