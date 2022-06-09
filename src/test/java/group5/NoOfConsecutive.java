package group5;

public class NoOfConsecutive {

	public static void main(String[] args) {
		String s="abbbccxszaassxiiiokksjnjjnj`";
		//String s= "!@#$%^^^^###!!!";
		//String s="//**--++//";
		//String s="11229988551111555";
				for (int i = 0; i < s.length(); i++) 
			 {
					int count=1;

             for (int j = i+1; j < s.length(); j++) 
             {
				if(s.charAt(i)==s.charAt(j))
				{					
					count++;
					i++;
				}
				else
				{
					//i=j-1;
				    break;
				}
					}
             
             System.out.print(s.charAt(i)+""+count);
            
            
		} 

	}

}
