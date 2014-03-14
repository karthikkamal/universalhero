import java.io.*;
class product
{
	int pid;
	product(int id)
	{
		pid = id;
	}
	void display()
	{
		System.out.println("Product ID "+pid);
	}
}
class Books extends product
{
	int cost;
	String name;
	Books(int id,String name,int c)
	{
		super(id);
		cost = c;
		this.name = name;
	}
	void display()
	{
		super.display();
		System.out.println("Book Title : "+name);
		System.out.println("Cost of Book : "+cost);
	}
}
class Scientific extends Books
{
	String author;
	Scientific(int id,String n,String a,int c)
	{
		super(id,n,c);
		author = a;
	}
	void display()
	{
		super.display();
		System.out.println("Author Name : "+author);
	}
}
class CD extends product
{
	int cost;
	String cdname;
	CD(int id,String name,int c)
	{
		super(id);
		cdname = name;
		cost = c;
	}
	void display()
	{
		super.display();
		System.out.println("CD Name : "+cdname);
		System.out.println("Cost of CD : "+cost);
	}
} 
class productDemo
{
	public static void main(String[] args) throws IOException
	{
		product p = new product(100);
		p.display();
		System.out.println();
		p = new Books(101,"LET US C++",100);
		p.display();
		System.out.println();
		p = new CD(102,"Songs",100);
		p.display();
		System.out.println();
		p = new Scientific(103,"C++","Deitel",200);
		p.display();
	}
}













