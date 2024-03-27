package week1.day2;

public class PrimeNumber {
	public static void main(String[] args) {
		int n=13;
		 int m=0,flag=0;
		 m =n/2;
		for (int i = 2; i<=m; i++) 
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{System.out.println("prime");
		}
		else
		{System.out.println("not prime");}
	}	
	}
	

