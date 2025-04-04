package com.pro1;

public class TwoDigitDifference 
{
   public static int getDiffOfDigit(int num )
   {
	   int result= num/100;
	   int output=((result+1)*100);
	   /*int ld1=num%10;
	   num=num/10;
	   int ld2=num%10;
	   int result=ld2-ld1;*/
	   
	   
	   return output;
	  
   }
}
