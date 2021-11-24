// Armstrong Number

import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner input = new Scanner(System.in);
      int Number = input.nextInt();
      int temp = Number;
      double Arm = 0;
      while(temp > 0) {
    	  Arm = Arm + Math.pow(temp%10, 3);
    	  temp = temp/10; 	  
      }
      if (Arm == Number)
    	  System.out.println("The given number " + Number + " is Armstrong Number");
      else
    	  System.out.println("The given number " + Number + " is not a Armstrong Number");
	}
	

}
