package group5;

public class FourByFourPattern {

	public static void main(String[] args) {
		int row=4;
		int num=1;
		for (int i = 0; i < row; i++) 
		{//row
			
			for (int j = 1; j <=4; j++) 
			{//column
				System.out.print(num);
				
			}
			num++;
			System.out.println();
		}

	}

}
