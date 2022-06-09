package group6;

public class CheckPaliFromArray {

	public static void main(String[] args)
	{
		int[] arr={22,36,51,98,77};
		for (int i = 0; i < arr.length; i++) 
		{
			int n=arr[i];
			int rev=0;
			while(n>0)
			{
				int digit= n%10;
			 rev= rev*10+digit;
			 int temp=n/10;
				
			}
			if(arr[i]==rev)
			{
				System.out.println(arr[i]);
			}
		}

	}

}
