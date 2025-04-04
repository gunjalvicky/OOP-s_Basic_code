package oppsUsingObj;

import java.util.Scanner;

public class ObjNotReference {
	int productId;
	String productName;
	double productPrice;
	
	
	public void setProductData()
	{
		Scanner s1 = new  Scanner(System.in);
		System.out.println("Enter the Product ID:");
		productId=s1.nextInt();
		System.out.println("Enter the Product Name:");
		productName=s1.nextLine();
		productName=s1.nextLine();
		System.out.println("Enter the Product :");
		productPrice=s1.nextDouble();
		s1.close();
		
		
	}
	public void getProductInfo()
	{

		System.out.println("Product ID is :"+productId);
		System.out.println("Prduct Name is : "+productName);
		System.out.println("Product Price is :"+productPrice);
		
	}
	
}
