package group7;

public class LeapYear {

	public static void main(String[] args)
	{
		//if Any year which is divisible by 400 is leap year 
        //else if divisible by 4 and not divisible by 100 then a leap year
		//else not a leap year
		
		int year=1993;
		
		if(year%400==0)
		{
			System.out.println("Leap Year");
		}
		else if(year%4==0 && year%100!=0)
		{
			System.out.println("Leap Year");
		}else{
			System.out.println("not a Leap Year");
		}
	}

}
