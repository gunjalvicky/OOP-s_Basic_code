package actomber;
import java.util.*;
public class Circle 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.printf("Entert the Radius :");
		double sc1=sc.nextDouble();
		AreaOfCircle areacircle=new AreaOfCircle();
		((AreaOfCircle) areacircle).getArea(sc1);
		
	}

}
