// Factorial Program In Java

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int Number = input.nextInt();
		int temp = Number;
		int fact = 1;
		while(temp > 0) {
			fact = fact * temp;
			temp--;
		}
		System.out.println("The Factorial of the " + temp + " is " + fact);

	}

}
