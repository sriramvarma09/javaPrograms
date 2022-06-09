package group5;

public class MirrorReverseRightTriangle {

	public static void main(String[] args) {
		int star=1;
		int space =3;
		for (int i = 0; i < 4; i++) 
		{
			for (int j = 0; j <space; j++) 
			{
				System.out.print(" ");
				
			}
			for (int k = 0; k < star; k++) 
			{
				System.out.print("*");
				
			}
			System.out.println();
			
			star++; space--;
		}
		
}}
