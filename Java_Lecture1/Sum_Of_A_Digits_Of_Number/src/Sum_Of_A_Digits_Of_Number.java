// Sum Of A Digits Of Number

import java.util.Scanner;

public class Sum_Of_A_Digits_Of_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner input = new Scanner(System.in);
     int number = input.nextInt();
     int sum = 0;
     while(number >0) {
    	 sum = sum + number%10;
    	 number = number/10;
     }
     System.out.println("The sum of the given number is " + sum);
	}

}
