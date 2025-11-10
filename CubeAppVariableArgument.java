class Cube
{
	void showCube(int...z)
	{
	int c=0;
	for(int i=0;i<z.length;i++)
	{
		c=z[i];
	}
	System.out.printf("Cube is:%d\n",c*c*c);
	}
}
public class CubeAppVariableArgument
{
	public static void main(String x[])
	{
		Cube c=new Cube();
		c.showCube(6);
	}
}