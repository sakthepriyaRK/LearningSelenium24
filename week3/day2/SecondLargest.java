package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargest {
	public static void main(String[] args) {
		int[] a=  {3, 2, 11, 4, 6, 7};
		List<Integer> list= new ArrayList<Integer>();
		for(Integer SecondLargest : a) {
			list.add(SecondLargest);
  
	}		Collections.sort(list);

//		int num=list.get(list.size()-2);
		  System.out.println("Second Largest Number is : " + list.get(list.size()-2));
}
}