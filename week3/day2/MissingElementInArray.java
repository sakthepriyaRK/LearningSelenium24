package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInArray {

	public static void main(String[] args) {
		int[] num ={1, 2, 3, 4, 10, 6, 8};
		List<Integer> list= new ArrayList<Integer>();
		for(Integer MissingElement : num) {
		list.add(MissingElement);
		}
		Collections.sort(list);
		System.out.println(list);
		for(int i=1;i<list.size();i++)
		{
			if(i!=list.get(i-1))
			{
			System.out.println(i);	
			break;
		}
}
}
}