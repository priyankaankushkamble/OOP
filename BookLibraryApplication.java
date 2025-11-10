class Book
{
	private int id;
	private String  name;
	private String author;

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
	public void setauthor(String author)
	{
		this.author=author;
	}
	public String getauthor()
	{
		return author;
	}
}
class Library
{
	Book book;
	void setBook(Book b)
	{
		book=b;
	}
	void showBook()
	{
	System.out.println(book.getid()+"\t"+book.getname()+"\t"+book.getauthor());
	}
}
public class BookLibraryApplication
{
	public static void main(String x[])
	{
	Book b=new Book();
	b.setid(18);
	b.setname("Java");
	b.setauthor("James Gosling");
	Library l=new Library();

	l.setBook(b);
	l.showBook();
	}
}