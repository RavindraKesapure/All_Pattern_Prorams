package com.mix.pattern;

public class NumThreeSim {

	public static void main(String[] args) {
		for(int i=5; i>=1; i--)
		{
			for(int j=5; j>=i; j--)
			{
				if(j>=i)
				{
					System.out.print(j);
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
