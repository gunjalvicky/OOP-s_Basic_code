package com.pro3;

public class RoundSum {                // 25 34 66
	public static int sumOfRoundedValues(int x,int y,int z ) {
		
		x=((x/10)+(x%10)/5)*10;
		y=((y/10)+(y%10)/5)*10;
		z=((z/10)+(z%10)/5)*10;
		
		return x+y+z;
	}

}
