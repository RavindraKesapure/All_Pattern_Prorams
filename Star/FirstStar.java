package com.ravi.Star;

import java.util.*;
public class FirstStar {

	public static void main(String[] args) {
		
		int n=4,k=1;
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=7; j++)
			{
				if(j>=5-i && j<=3+i && k==1)
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
