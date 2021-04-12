package com.ravi.Star;

public class StartTwoApp {

	public static void main(String[] args) {
		
		int n=9,count=1,count1,k;

		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("");
			}
			for(k=1; k<=n-count; k++)
			{
				System.out.print(k+" ");
			}
			
			if(i> n/2)
			{
				count--;
			}
			else
			{
				count++;
			}
			
			System.out.println();
		}
	}

}
