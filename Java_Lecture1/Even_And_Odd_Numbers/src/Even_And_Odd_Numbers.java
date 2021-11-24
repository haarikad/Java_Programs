//Write a program to print whether a number is even or odd, also take input.


import java.util.Scanner;

public class Even_And_Odd_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number%2 == 0)
			System.out.println("The given number " + number + " is a even number");
		else
			System.out.println("The given number " + number + " is a odd number");

	}

}
