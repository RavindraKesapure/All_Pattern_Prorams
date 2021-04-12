package com.ravi.Star;

public class GLLGPattern {

	public static void main(String[] args) {
		
		int row=10,col=5,count=0;
	
		for(int i=1; i<=row; i++)
		{
		
			for(int j=1; j<=col; j++)
			{   
			     //count=j; 
				if(j>=1)
				{
					System.out.print(" " +j);
			      if(j<=4)
			      {
				    System.out.print(" "+j);
				    j--;
			      }
			      else
			      {
			    	  System.out.print(" ");
			      }
				 
				}
				
				
			}
			System.out.println();
		}
	}
}