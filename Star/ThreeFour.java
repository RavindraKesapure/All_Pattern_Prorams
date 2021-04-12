package com.ravi.Star;

public class ThreeFour {

	public static void main(String[] args) {

		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				// if(j==1 || i==5 || i==j) 
				// if(j==5 || i==5 || i+j==6)
				// if(i==1 || j==1 || i+j==6)
				
				if(i==1 || j==5 || i==j)
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
