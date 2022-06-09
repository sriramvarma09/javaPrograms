package group6;

public class A 
{
	int x=10;
    static int y=20;
    public void test()
    {
    	System.out.println(this.x);
    	System.out.println(x);
        System.out.println(A.y );               
    
    }
     public static void test1()
     {
    	 System.out.println(A.y );      
                      
     }

	public static void main(String[] args) {
		

	}

}
