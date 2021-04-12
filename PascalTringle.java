package com.mix.pattern;

public class PascalTringle {

	public static void main(String[] args) {
     int row=5,count,j=0;
     for(int i=0; i<row; i++)
     {
    	 count=1;
    	 j=0;
    	 for(int k=0; k<=row; k++)
    	 {
    		 if(k>=row-i)
    		 {
    			 System.out.print(count+" ");
    			 count=count*(j-i)/(j+1);
    			 j++;
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
