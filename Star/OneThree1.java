package com.ravi.Star;

public class OneThree1 {

	public static void main(String[] args) {

		int k=0;
		
		for(int i=1; i<=10; i++)
		{
			if(i<=5)
			{
				k++;
			}
			else
			{
				k--;
			}
		
			for(int j=5; j>=1; j--)
			{
				if(j<=k)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
				
			}
			System.out.println();
		}
	}

}
