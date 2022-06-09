package group7;

public class LargestOf3Numbers 
{

	public static void main(String[] args) 
	{
		int x=10;
		int y=5;
		int z=3;
		if (x>y){
			if(x>z)
			{
				System.out.println("largest number is " +x);
			}else{
				System.out.println("largest number is " +z);
			}
			
		}
		else if(y>x){
			if(y>z)
			{
				System.out.println("largest number is " +y);
			}else{
				System.out.println("largest number is " +z);
			}
		}

	}

}
