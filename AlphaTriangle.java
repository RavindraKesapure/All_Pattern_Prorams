package com.mix.pattern;

public class AlphaTriangle {

	public static void main(String[] args) {

		int alpha = 65;
		int k=0;
		for(int i=0; i<=5; i++)
		{ k=1;
			for(int j=0; j<=9; j++)
			{
				if(j>=6-i && j<= 4+i && k==1)
				{
					System.out.print((char)(alpha +i));
					k=0;
				}
				else
				{
					System.out.print(" ");
					k=1;
				}
				
			}
			System.out.println();
		}
	}

}
