//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class Simple_Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.println("Enter the Principal Amount : ");
        int Principal = input.nextInt();
        System.out.println("Enter the time: ");
        int Time = input.nextInt();
        System.out.println("Enter the Rate of Interest: ");
        int Rate = input.nextInt();
        int SI = (Principal * Time * Rate)/100;
        System.out.println("The simple interest is " + SI);
	}

}
