// Area Of Equilateral Triangle

import java.util.Scanner;

public class Area_Of_Equilateral_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
        int side = input.nextInt();
        System.out.println("The area of Equilateral Triangle" + ( (Math.sqrt(3)/4) * Math.pow(side, 2) ) );
	}

}
