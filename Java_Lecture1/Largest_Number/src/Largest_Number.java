
// Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class Largest_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first Number: ");
		int num1 = input.nextInt();
		System.out.println("Enter the second Number: ");
		int num2 = input.nextInt();
		if(num1 > num2)
			System.out.println("The largest number is " + num1);
		else
			System.out.println("The largest number is " + num2);
	}

}
