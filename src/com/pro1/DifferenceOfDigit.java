package com.pro1;
import java.util.Scanner;
public class DifferenceOfDigit
{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num=sc.nextInt();
		int result=TwoDigitDifference.getDiffOfDigit(num);
		System.out.println("If the given value is "+result);
		sc.close();
		

	}

}
