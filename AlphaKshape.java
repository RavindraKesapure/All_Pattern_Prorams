package com.mix.pattern;

public class AlphaKshape {

	public static void main(String[] args) {

		int alpha = 65;
		for(int i=0; i<=9; i++)
		{
			for(int j=0; j<=5; j++)
			{
				if(j<=i)
				{
					System.out.print((char)(alpha + j));
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
