// Java Program Vowel Or Consonant

import java.util.Scanner;

public class Vowel_Or_Consonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		char letter = input.next().trim().charAt(0);
		if( (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U' || letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') ) {
		  System.out.println("The given letter is a Vowel");
		}
		else
			System.out.println("The given letter is a Consonant");
              
	}
}
