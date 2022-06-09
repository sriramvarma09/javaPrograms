package group8;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class PositionOfCharAtOneTime {

	public static void main(String[] args) {
		String s="Tester";
		s=s.toLowerCase();
		/* o/p  t=1 4
		 *      e=2 5
		 *      s=3 3
		 *      r=6 6
		 */
		LinkedHashSet<Character> set= new LinkedHashSet<Character>();
      for (int i = 0; i < s.length(); i++) {
    	  set.add(s.charAt(i));
    	
	}
      
      for (Character character : set) {
		int count=0;
		for (int i = 0; i < s.length(); i++) //for (int i = s.length()-1; i >=0 ; i++)
		{
		if	(character==s.charAt(i)){
			System.out.println(character+""+(i+1));
			break;
		}
		}
	}
	}

}
