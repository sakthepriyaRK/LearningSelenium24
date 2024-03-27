package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingCollectionReverse {
public static void main(String[] args) {
	String [] str= new String []{ "HCL","Wipro", "Aspire Systems", "CTS"};
	List<String> list= new ArrayList<String>();
for (String sorting : str) {
	list.add(sorting);
	System.out.println(sorting);
}
Collections.sort(list,Collections.reverseOrder());
{System.out.println("SortingCollection Reverse :"+ list);



//for(int i=0; i<list.size();i--)
//{System.out.println("SortingCollection Reverse :"+ list.get(i));
//}
}
}}