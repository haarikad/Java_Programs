// Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class Print_Largest_Number_From_User_Inputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner input = new Scanner(System.in);
       int Number = input.nextInt();
       int Max = 0;
       while(Number != 0) {
    	   if(Number > Max)
    		   Max = Number;
    	   Number = input.nextInt();
       }
       System.out.println("The Maximum of all the integer inputs is " + Max);
	}

}
