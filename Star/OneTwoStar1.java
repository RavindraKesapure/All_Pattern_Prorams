package com.ravi.Star;

public class OneTwoStar1 {

	public static void main(String[] args) {
		
		int k=0;

		for(int i=1; i<=7; i++)
		{
			k=1;
			for(int j=1; j<=7; j++)
			{
				if(j<=5-i || j>=3+i)
				{
					System.out.print(k);
				}
				else
				{
					System.out.print(" ");
				}
				
				if(j<4)
				{
					k++;
				}
				else
				{
					k--;
				}

			}
			System.out.println();
		}
	}

}
