
// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

import java.util.Scanner;

public class Sum_Of_All_The_Integer_Inputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner input = new Scanner(System.in);
      int number = input.nextInt();
      int add = 0;
      while(number != 0) {
    	  add = add + number;
    	  number = input.nextInt();
      }
      System.out.println("The sum of the integers is " + add);
      
	}

}
