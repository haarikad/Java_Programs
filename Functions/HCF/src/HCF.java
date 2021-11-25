// HCF Of Two Numbers Program

import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner input = new Scanner(System.in);
      int num1 = input.nextInt();
      int num2 = input.nextInt();
      System.out.println("The HCF of two numbers is " + HCF(num1,num2));
      System.out.println("The LCM of two numbers is " + ( (num1*num2) / (HCF(num1,num2)) ));
      
	}
	
   static int HCF(int num1, int num2) {
	   
	   while( (num1%num2) != 0 ) {
		   int temp = num2;
		   num2 = num1%num2;
		   num1 = temp;
	   }
	   return num2;
   }
}
