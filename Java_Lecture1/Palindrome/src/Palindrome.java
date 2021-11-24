// To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        String Name = input.next();
        String RevName = "";
        int length = Name.length();
        for(int i=length-1; i>=0; i--) 
        	RevName = RevName + Name.charAt(i); 
        if(Name.equals(RevName))
        System.out.println("Give string is Palindrome");
        else
        	System.out.println("GIven String is not Palindrom");
	}
	  
}
