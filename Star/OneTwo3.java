package com.ravi.Star;

public class OneTwo3 {

	public static void main(String[] args) {
				
				int k=0;

				for(int i=1; i<=7; i++)
				{
					if(i<=4)
					{
						k++;
					}
					else
					{
						k--;
					}
					
					for(int j=1; j<=4; j++)
					{
						if(j<=k)
						{
							System.out.print(k);
							
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
