// Find Ncr & Npr

import java.util.Scanner;

public class Permutations_And_Combinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the n value: ");
		int n = input.nextInt();
		System.out.print("Enter the r value: ");
		int r = input.nextInt();
		float permutation = factorial(n)/factorial((n-r));
		float combination = permutation/factorial(r);
		
		System.out.println("The permutation of " + n + " and " + r + " is " + permutation );
		System.out.println("The combination of " + n + " and " + r + " is " + combination );
		

	}
	static int factorial(int n) {
		int fact = 1;
		while(n>0) {
			fact = fact * n;
			n--;
		}
		return fact;
	}

}
