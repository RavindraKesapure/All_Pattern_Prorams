package com.mix.pattern;

public class StarTwo {

	public static void main(String[] args) {

		for(int i=5; i>=1; i--)
		// for(int i=1; i<=5; i++)

		{
			for(int j=1; j<=5; j++)
			{
				  //  if(j<=i)
				 if(i<=j)
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
