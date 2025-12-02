import java.util.*;
class STD
{
	int marks[];
	String stdName,studName;
	void setMarks(String stdName,String studName,int smarks[])
	{
		this.stdName=stdName;
		this.studName=studName;
		this.marks=smarks;
	}
	
}
class Result extends STD
{
	void showResult()
	{
	System.out.println("Standard Name is:"+stdName);
	System.out.println("Student Name is:"+studName);
	
		int per=0;
		for(int i=0;i<marks.length;i++)
		{
			per=per+marks[i];
		}
		System.out.printf("Percentage is:"+(per/marks.length));
	}
	
}
public class SingleLevelApp
{
	public static void main(String x[])
	{
		Result r=new Result();
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[6];
		System.out.println("Enter Standard Name");	
		String stdName=xyz.nextLine();
		System.out.println("Enter Student Name");
		String studName=xyz.nextLine();
		System.out.println("Enter Student Marks");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		r.setMarks(stdName,studName,a);
		r.showResult();
	}
}
