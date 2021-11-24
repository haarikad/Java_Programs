
//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.Scanner;

public class Calaculate_The_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the first Number: ");
      int num1 = input.nextInt();
      System.out.println("Enter the Second Number: ");
      int num2 = input.nextInt();
      System.out.println("Enter the Operator: ");
      char operator = input.next().charAt(0);
      if(operator == '+')
    	  System.out.println("The sum of " + num1 + " and " + num2 + " is " +  (num1+num2));
      else if(operator == '-' )
    	  System.out.println("The difference of " + num1 + " and " + num2 + " is " +  (num1-num2) );
      else if(operator == '*' )
    	  System.out.println("The multiplication of " + num1 + " and " + num2 + " is " + (num1 * num2) );
      else
    	  System.out.println("The division of " + num1 + " and " + num2 + " is " +  (num1 / num2) );
	}

}
