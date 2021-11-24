// Subtract the Product and Sum of Digits of an Integer

import java.util.Scanner;

public class Subtract_the_Product_and_Sum_of_Digits_of_an_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int mul = 1;
	    int add = 0;
		while(number > 0) {
			mul = mul * number%10;
		    add = add + number%10;
		    number = number/10;
		}
		System.out.println("The substraction of the product and sum of Digits of an Integer is " + (mul - add));
	}

}
