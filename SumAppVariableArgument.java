class Sum
{
	void calSum(int...p)
	{
	int s=0;
	for(int i=0;i<p.length;i++)
	{
		s=s+p[i];
	}
	System.out.print("Sum of Number is:"+s);
	}
}
public class SumAppVariableArgument
{
	public static void main(String x[])
	{
		Sum s1=new Sum();
		s1.calSum(10,20,30,40,50); 
	}
}