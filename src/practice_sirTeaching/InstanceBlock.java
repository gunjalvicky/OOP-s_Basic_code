package practice_sirTeaching;

public class InstanceBlock
{
	public int x;
	public InstanceBlock()
	{
		super();
		int x=12;
		System.out.println("It is a constructor: "+x);
		
	}
	
	
	{
		int x=13;
		System.out.println("it is a nsb-"+x);
	}
	
	{
		System.out.println("It is a nsb-2 :");
	}
	public static void main(String[] args)
	
	{
		
		InstanceBlock sc =new InstanceBlock();
		
	}

}
