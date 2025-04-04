package practice;

import java.util.jar.JarException;

class Test
{
	static {
		System.out.println("class loading");
	}
}
public class CommandAdd
{
	public static void main(String[]args) throws JarException, ClassNotFoundException
	{
		Class.forName("practice.Test");
	}
}