import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner input = new Scanner(System.in);
       int year = input.nextInt();
    
       if( ( (year%4 == 0) && (year%100 != 0) ) || (year%400 == 0) )
    	   System.out.println("The given year " + year + " is a leap year");
       else
    	   System.out.println("The given year " + year + " is not a leap year");
	}

}
