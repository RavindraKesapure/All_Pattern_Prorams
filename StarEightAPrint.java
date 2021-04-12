package com.mix.pattern;

public class StarEightAPrint {

	public static void main(String[] args) {

		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=9; j++)
			{
				 // if(i+j==6 || j-i==4 || i==3 && j==5)
				
				// if(i+j==6 || j-i==4 || i==5)
				
				if(i==1 || i+j==10 || i==j)
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
