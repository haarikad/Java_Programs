// Calculate Discount Of Product

import java.util.Scanner;

public class Discount_Of_Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner input = new Scanner(System.in);
      int MP = input.nextInt();
      int SP = input.nextInt();
      System.out.println(" The Discount of the product with " + MP + " and " + SP + " is " + (MP-SP) );
	}

}
