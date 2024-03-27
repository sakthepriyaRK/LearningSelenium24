package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersectionList {
	public static void main (String[]args)

	{ 
		int[]a1={3, 2, 11, 4, 6, 7};
		int[] a2= {1, 2, 8, 4, 9, 7};
		List<Integer> List1= new ArrayList<Integer>();
		List<Integer> List2= new ArrayList<Integer>();
		
		

			
			for(Integer array1 : a1)
				{
				List1.add(array1);
				}
		System.out.println(List1);
		
		for(Integer array2 : a2)
		{
		List2.add(array2);
		}
System.out.println(List2);
List2.retainAll(List1);
System.out.println(List2);
		}		}
