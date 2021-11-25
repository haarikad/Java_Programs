// Reverse A String In Java

import java.util.Scanner;

public class Reverse_The_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner input = new Scanner(System.in);
      String Word = input.nextLine();
      String Reverse = "";
      System.out.println("Before reversing the value of the Reverse string is" + Reverse);
      for(int i= (Word.length()-1); i >= 0; i--) {
    	Reverse+=Word.charAt(i);
      }
      System.out.println(Reverse);
      Word = Reverse;
    	System.out.println("The Reversed string is " + Word);
	}

}
