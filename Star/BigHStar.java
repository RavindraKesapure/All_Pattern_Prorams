package com.ravi.Star;

public class BigHStar {

	public static void main(String[] args) {
		for(int i=1; i<=9; i++)
		{
			for(int j=1; j<=10; j++)
			{
		     
				if(i==5 || j==1 || j==10 || j<=6-i)
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
