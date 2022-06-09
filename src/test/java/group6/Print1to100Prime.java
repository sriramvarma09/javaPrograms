package group6;

public class Print1to100Prime {

	public static void primeOrNot(int num){
		int i= 2;
		boolean flag= false;
		
		while(i<num){
			
			if(num%i==0){
				
				flag=true;
				break;
			}
			else
			{
				i++;
			}
		}
if(flag==false){
	System.out.println(num);
}
	}
	public static void main(String[] args) {
		int num;
		for (int i = 2; i <100; i++) {
			num=i;
			primeOrNot(num);
		}
	}

}
