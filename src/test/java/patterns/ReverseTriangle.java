//reverse Triangle code
package patterns;

public class Triangle {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in)
		int row=sc.nextInt();
		for (int i = 0; i <=row; i++) {  //row
	    	   
			for (int j = row; j >=i; j--) {  //column
	    		  
				System.out.print(" ");
				
			}for (int j = 1; j <= i; j++) 
			 {
                System.out.print("* ");
            }
			 System.out.println();
		}

	}

}
