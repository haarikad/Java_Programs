// Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

import java.util.Scanner;

public class Max_And_Min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		System.out.println("The Maximum of three numbers is " + Max(num1,num2,num3) );
		System.out.println("The Minimum of three numbers is " + Min(num1,num2,num3) );

	}
	
   static int Max(int num1, int num2, int num3) {
	   int Max = num1;
	   if(num2>Max)
		   Max = num2;
	   if(num3>Max)
		   Max = num3;
	   return Max;
   }
   
   static int Min(int num1, int num2, int num3) {
	   int Min = num1;
	   if(num2<Min)
		   Min = num2;
	   if(num3<Min)
		   Min = num3;
	   return Min;
   }
}
