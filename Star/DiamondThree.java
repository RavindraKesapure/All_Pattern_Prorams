package com.ravi.Star;

public class DiamondThree {

	public static void main(String[] args) {

		for(int i=1; i<=9; i++)
		{
			for(int j=1; j<=5; j++)
			{
				 
				 // if(j==1 || i==j || i+j==10)   first
				
				if(j==5 || i+j==6 || i-j==4) // second
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
