package com.mix.pattern;

public class AlphaSimple {

	public static void main(String[] args) {

		 int alphabet = 65;
         for (int i = 0; i <= 5; i++)
         {
               for (int j = 0; j <= i; j++)
               {
            	   if(j<=i)
            	   {
            	       System.out.print((char) (alphabet + j) + " ");  //   or ---> (char) (alphabet +i)
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
