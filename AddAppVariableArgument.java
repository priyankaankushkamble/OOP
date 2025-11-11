class Add
{
	void showAdd(int...z)
	{
	int c=0;
	for(int i=0;i<z.length;i++)
	{
		c+=z[i];
	}
	System.out.printf("Add is:%d\n",c);
	}
}
public class AddAppVariableArgument
{
	public static void main(String x[])
	{
		Add ad=new Add();
		ad.showAdd(4,5);		
	}
}