package com.ravi.Star;

public class OneTwo1 {

	public static void main(String[] args) {

		for(int i=1; i<=5; i++)
		{
		   for(int j=5; j>=i; j--)
		   {
			   if(j>=i)
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
