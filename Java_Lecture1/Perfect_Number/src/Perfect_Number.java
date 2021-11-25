// Perfect Number In Java

import java.util.Scanner;

public class Perfect_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner input = new Scanner(System.in);
     int number = input.nextInt();
     int perfect = 0;
     for(int i = 2; i*i < number ; i++) {
    	 if(number%i == 0) {
    		 perfect = perfect + i + number/i;
    	 }
     }	 
     if( (number-perfect == 1) ) 
    	 System.out.println("The given number is a perfect number");
     else
    	 System.out.println("The given number is not a perfect number");
     } 

}
