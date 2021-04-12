package com.ravi.Star;

public class TwoStar2 {

	public static void main(String[] args) {
		
		int k=0;
		for(int i=1; i<=10; i++)
		{
			k=1;
		   for(int j=1; j<=5; j++)
		  {
			if(j<=6-i)
			{
				System.out.print(k);
			}
			else
			{
				System.out.print(" ");
			}
			
			if(i<=5)
			{
				k--;
			}
			else
			{
				k++;
			}
			
		}
		System.out.println();
      }
	}

}
