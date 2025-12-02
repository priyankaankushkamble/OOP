class U
{
	private U()
	{
	}
	static void show()
	{
	System.out.println("I am Show Method of u");
	}
	static void display()
	{
	System.out.println("I am display method of u");
	}
}
public class UtilityApp
{
	public static void main(String x[])
	{
		U.show();
		U.display();
	}
}