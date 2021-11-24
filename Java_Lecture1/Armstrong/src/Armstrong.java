// To find Armstrong Number between two given number.

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the First Number");
		int num1 = input.nextInt();
		System.out.println("Enter the Second Number");
		int num2 = input.nextInt();
		int flag = 0;
		for(int i=num1 ; i < num2 ; i++) {
			int Rev = 0;
			//int mult = 1;
			int temp = i;
			
			while(temp%10 != 0) {
				//Rev = Rev + Math.;
				Rev = Rev + ((temp%10)*(temp%10)*(temp%10));
			//	mult = mult*10;
				temp = temp/10;
			}
			if(Rev == i) {
				System.out.print(i + " ");
				 flag =1;
			}
		}
        if(flag == 1)
        	System.out.println("are Armstrong Numbers");
        else
        	System.out.println("There is no Armstrong Numbers");
	}

}
