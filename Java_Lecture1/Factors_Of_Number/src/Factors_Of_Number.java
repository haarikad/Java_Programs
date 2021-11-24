// Input a number and print all the factors of that number (use loops).

import java.util.Scanner;

public class Factors_Of_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int Number = input.nextInt();
		System.out.print(1 + " ");
        for(int i = 2; i <= Number/2 ; i++) {
        	if(Number%i == 0)
        		System.out.print(i + " ");
        }
        System.out.println("and " + Number + " are factors of " + Number);
	}

}
