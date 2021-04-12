package com.mix.pattern;

public class StarFourDR {

	public static void main(String[] args) {
 
		int k=1;
		for(int i=1; i<=5; i++)
		{   k=1;
			for(int j=9; j>=i; j--)
			{
				if(j>=0+i && j<=10-i && k==1 )
				{
					System.out.print("*");
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
