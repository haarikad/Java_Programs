// To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner input = new Scanner(System.in);
          int num1 = 0;
          int num2 = 1;
          int number = input.nextInt();
          System.out.print(num1 + " " + num2 + " ");
          while(number > 0) {
        	  int t = num1+num2;
        	  System.out.print(" " + t);
        	  num1 =num2;
        	  num2 = t;
        	  number--;      	  
          }
	}

}
