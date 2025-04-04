package com.pro3;
import java.util.Scanner;
public class ThreeRoundedNumber 
{

	public static void main(String[] args) 
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.printf("Enter A  Number: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int ans =RoundSum.sumOfRoundedValues(a,b,c);
		System.out.println(ans);
		sc.close();
		
	
	}

}
