class S
{
	private static S s1=null;
	S()
	{
	System.out.println("I am Singleton class");
	}
	public static S getInstance()
	{
		if(s1==null)
		{
			s1=new S();
		}
		return s1;
	}
}
public class SingletonApp
{
	public static void main(String x[])
	{
	S s1=S.getInstance();
	S s2=S.getInstance();
	S s3=S.getInstance();
	
	
	}
}