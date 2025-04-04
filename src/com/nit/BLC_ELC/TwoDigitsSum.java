package com.nit.BLC_ELC;

public class TwoDigitsSum {
   public static int getSumOfDigits(int num )
   {
	   if(num<100)
	   {
	  int result=(num/10)+(num%10);
	  return result;
	   }
	   else return 0;
	  
   }
}
