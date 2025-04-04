package com.pro3;

import java.util.Scanner;

public class NextMultipleOfHundredt 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num=sc.nextInt();
		int result=Multiplication.getnextmultiple(num);
		System.out.println("If the given value is "+result);
	}

}
