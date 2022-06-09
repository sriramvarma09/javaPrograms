package group6;

public class CountNumOfA {

	public static void main(String[] args) {
		//I/p=Malayalam
				//O/p=a4
		
		String s = "Malayalam";
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='a'){
				count++;
			}
			
		}
		System.out.println("a "+count );

	}

}
