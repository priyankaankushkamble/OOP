class Area
{
	Area(float radius)
	{
	float area=radius*radius*3.14f;
	System.out.printf("Area of circle is:%f\n",area);
	}
	Area(int length,int width)
	{
	System.out.printf("\nArea of rectangle is:%d\n",length*width);
	}
}
public class CircleAreaApp
{
	public static void main(String x[])
	{
	Area a1=new Area(5.4f);// call circle area
	Area a2=new Area(5,4);// call rectangle area
	}
}