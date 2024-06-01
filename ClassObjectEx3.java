/* Create class and explain passing object as function argument */

import java.util.Scanner;

class Author
{
	int id;
	String name;
	int totalBooksPublished;
	static Scanner scan = new Scanner(System.in);

	public void push()
	{
		System.out.print("\n Enter author Id :");
		id = scan.nextInt();

		System.out.print("\n Enter author name :");
		name = scan.next();

		System.out.print("\n Enter number of books published :");
		totalBooksPublished = scan.nextInt();
	}
}

class ClassObjectEx3
{
	public static void main(String []args)
	{
		Author a1 = new Author();
		a1.push();

		Author a2 = new Author();
		a2.push();

		//compare who author wrote number of books
		compare(a1, a2);
	}

	public static void compare(Author x, Author y)
	{
		if(x.totalBooksPublished > y.totalBooksPublished)
		{
			System.out.println(x.name + " wrote number of books");
		}
		else
		{
			System.out.println(y.name + " wrote number of books");
		}
	}
}