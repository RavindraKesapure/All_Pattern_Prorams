package com.ravi.Star;

public class SqureSpace {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=9; j++)
			{
		      //  if(i+j==6 || i==1 && j>=5 || i+j==10 || i==5 && j<=5)
				
				if(i==1 && j<=5 || i==j || i==5 && j>=5 || j-i==4)
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
