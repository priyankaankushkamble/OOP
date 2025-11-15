import java.util.*;
class Power
{
	int base,index;
	Power(int base,int index)
	{
		this.index=index;
		this.base=base;
	}
	int getPower()
	{
	int p=1;
	for(int i=1;i<=index;i++)
	{
		p=p*base;
	}
		return p;
	}
}
public class PowerApp
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int base,index;
		System.out.println("Enter The Base:");
		base=xyz.nextInt();
		System.out.println("Enter The Index:");
		index=xyz.nextInt();

		Power p=new Power(base,index);
		int result=p.getPower();

		System.out.println("Power is:"+result);
	}
}