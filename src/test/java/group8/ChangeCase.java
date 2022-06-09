package group8;

public class ChangeCase {

	public static void main(String[] args) {
		String s="ABcd12";
		String s2=null;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
			{
				s=s.toLowerCase();
			}
		}
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)>='a'&&s.charAt(i)<='z')
			{
				s=s.toUpperCase();
			}
			
		}System.out.println(s);
	}

}
