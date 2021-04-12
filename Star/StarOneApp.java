package com.ravi.Star;

public class StarOneApp {

	public static void main(String[] args) {
		
		int count=1,count1=0,n=9;
		
		for(int i=1; i<=n; i++)
		{
			count1=i;
			for(int j=1; j<=count; j++)
			{
				System.out.print(j +"  ");
				count1=count1+i;
			}
			
			if(i > n/2)
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
