class Employee
{
	private int id;
	private String name;
	private int sal;

	public void setid(int id)
	{
		this.id=id;
	}
	public int getid()
	{
		return id;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public String getname()
	{
		return name;
	}
	public void setsal(int sal)
	{
		this.sal=sal;
	}
	public int getsal()
	{
		return sal;
	}
}
public class EmployeePojo
{
	public static void main(String x[])
	{
	Employee emp=new Employee();
	emp.setid(18);
	emp.setname("Priya");
	emp.setsal(55000);

	System.out.println("Id is:"+emp.getid());
	System.out.println("Name is:"+emp.getname());
	System.out.println("Salary is:"+emp.getsal());	
	}
}