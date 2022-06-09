package group5;

public class RightAngleTriangle {

	public static void main(String[] args) {
     int star=1;
     int space=3;
     
    for (int i = 4; i >=1; i--)
    {
    	for (int j = space; j >=4 ; j--) 
    	{
			System.out.print("*");
		}
		
    	for (int j =star; j >=1; j--) 
		{
			System.out.print(" ");
		}
		System.out.println();
	}
    
    star++; space--;


	}

}
