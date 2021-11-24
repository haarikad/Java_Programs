// Calculate Average Of N Numbers

import java.util.Scanner;

public class Average_Of_N_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int Number = input.nextInt();
		float sum = 0;
		float count = 0 ;
		float temp = Number;
		while(Number > 0) {
			sum = sum + Number;
			Number--;
			count++;
		}
	//	float Average = sum/count;
		System.out.println("The sum is " + sum + " The count is " + count);
        System.out.println("The Average of " + temp + " Number is " + (sum/count) );
	}

}
