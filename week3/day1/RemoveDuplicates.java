package week3.day1;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
		public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";
		String[] str=text.split(" ");
		List<String> input=new ArrayList<String>();
		List<String> input1=new ArrayList<String>();
		for (int i = 0; i < str.length; i++) {
				if(input.contains(str[i]))
				{input1.add(str[i]);

			}
				else
				{
					input.add(str[i].replace("java", "selenium"));
					//input.add(str[i]);
				}
			}
		}}
