package week1.day2;

public class Fibanocci {
	public static void main(String[] args)
	{
	int range=8, n1=0,n2=1;
	System.out.println(n1);
	 int sum;
	for (int i = 1; i <range; i++)
	{
		sum=n1+n2;
		System.out.println(sum);
		n1=n2;
		n2=sum;
		
	}
}
}
