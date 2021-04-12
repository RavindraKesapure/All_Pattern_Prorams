package com.ravi.Star;

public class DiamondSpace {

	public static void main(String[] args) {

		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=9; j++)
			{
				 if(i==5 || i+j==6 || j-i==4)  //Simple 
				
			//	if(i==1 || i==j || i+j==10) // reverse
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
