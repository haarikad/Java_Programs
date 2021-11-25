
public class EvenDays_Of_Month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int count = 0;
		for(int i=1; i<=31; i++) {
			
			if(i%2 == 0)
				count++;
		}
		System.out.println("The number of days kunal can go out in the month of August is " + count);

	}

}
