package text;

import java.util.Scanner;

public class Inventory 
{
	String game;
	String developer;
	int stockQuntity;
	
	public void setInventoryDetails()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Game Name : ");
		game = sc.nextLine();
		System.out.println("Enter the Game developer Name:");
		developer=sc.nextLine();
		System.out.println("Enter the stock Price:");
		stockQuntity=sc.nextInt();
		sc.close();
	}
	
	public void getInventoryDetails()
	{
		System.out.println("Game Name is "+game);
		System.out.println("Game Developer Name is "+developer);
		System.out.println("Stocks price is "+stockQuntity);
		
	}

}
