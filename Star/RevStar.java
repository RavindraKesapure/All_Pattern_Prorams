package com.ravi.Star;

public class RevStar {

	public static void main(String[] args) {

		for(int i=1; i<=5; i++)
		{
			for(int j=5; j>=i; j--)
			{
				System.out.print("#");
			}
			System.out.println();
		}
	}

}
