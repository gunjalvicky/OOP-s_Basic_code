
package com.nit.BLC_ELC;
import java.util.Scanner;
public class TwodigitSumTester {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number:");
		int side=sc.nextInt();
		int num = TwoDigitsSum.getSumOfDigits(side);
		System.out.println("If the given value is "+num);
		sc.close();

	}

}
