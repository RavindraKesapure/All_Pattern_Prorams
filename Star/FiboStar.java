package com.ravi.Star;

public class FiboStar {

	public static void main(String[] args) {

		int n=6;
		
		for(int i=1; i<=n; i++)
		{
			 int a=0,b=1;
			
			for(int j=1; j<=i; j++)
			{
				int c=a+b;
				System.out.print(c+ " ");
				a=b;
				b=c;
			}
			
			System.out.println();
		}
	}

}
