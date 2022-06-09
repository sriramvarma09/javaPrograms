package group5;

import java.util.ArrayList;
import java.util.Collections;

public class SeconfLargeUsingSingleLoop {

	public static void main(String[] args) {
		int [] arr = {20,10,50,30,60};
		ArrayList<Integer> list= new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		Collections.sort(list);
		int count = list.size();
		System.out.println(list.get(count-2));
		

	}

}
