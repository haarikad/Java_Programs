// Find if a number is palindrome or not

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner input = new Scanner(System.in);
      int num = input.nextInt();
      if(Palindrome(num))
    	  System.out.println("The given number is a Palindrome");
      else
    	  System.out.println("The given number is not a Palindrome");
     
	}
	
	static boolean Palindrome(int num) {
		 int Reverse = 0;
	     int temp = num;
	     while(temp > 0) {
	    	  Reverse = Reverse*10 + temp%10;
	    	  temp = temp/10;
	      }
	     return (Reverse == num);
	}

}
