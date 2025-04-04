package oops;

public class Car
{
	String carcompony;
	String carname;
	int price;
	int validate;
	
	public void getCarInfo()
	{
		System.out.println("--------------------------------------------------------");
		System.out.println("Car compony name is :"+carcompony);
		System.out.println("Car name is :"+carname);
		System.out.println("Price of the car :"+price +" lac");
		System.out.println("The car is validate in :"+validate+"years");
	}
	public void carSpecification()
	{
		System.out.println("I'll wait in the car");
		System.out.println("--------------------------------------------------------");
	}
	

}
