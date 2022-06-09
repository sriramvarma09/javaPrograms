package group6;

public class ReplaceWhiteSpace {

	public static void main(String[] args) {
		String s = "Saket Saurav        is a QualityAna    list";
		Object s2 = s.replaceAll(" ", "");
		
		System.out.println(s2);

	}

}
