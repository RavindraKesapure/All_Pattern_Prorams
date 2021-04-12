package com.mix.pattern;

public class AlphaDiamondSpace {

	public static void main(String[] args) {
		int alpha = 65;
		int k=0;
		for(int i=0; i<7; i++)
		{ 
			for(int j=0; j<7; j++)
			{
				if(i+j==3 || j-i==3 || i-j==3 || i+j==9 )
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
