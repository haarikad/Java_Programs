
//Input currency in rupees and output in USD.

import java.util.Scanner;

public class Rupess_To_USD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner input = new Scanner(System.in);
       int Rupees = input.nextInt();
       System.out.println("The given " + Rupees + " in USD is " + (Rupees * 0.013));
	}

}
