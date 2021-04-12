package com.mix.pattern;

public class SandGlasStarSeven {

	public static void main(String[] args) {

		int k=0,count=0;
		for(int i=1; i<=9; i++)
		{
			k=1;
			if(i<=5)
			{
				count++;
			}
			else
			{
				count--;
			}
			
			for(int j=1; j<=9; j++)
			{
				if(j>=0+count  && j<=10-count && k==1)
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
