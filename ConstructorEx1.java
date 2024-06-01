/* constructor */

class Book
{
	String title;
	String author;
	float cost;
	int copies;

	//default
	Book()
	{
		title = "HTML";
		author = "James Mathew";
		cost = 450.00f;
		copies = 4;
	}

	//Parameterized Constructor
	Book(String title, String author, float cost, int copies)
	{
		this.title = title;
		this.author = author;
		this.cost = cost;
		this.copies = copies;
	}

	void show()
	{
		System.out.println(title + "\t" + author + "\t" + cost + "\t" + copies);
	}
}

class ConstructorEx1
{
	public static void main(String []args)
	{
		//default
		Book b1 = new Book();
		b1.show();

		//parameterized
		Book b2 = new Book("SQL", "Peter Mathew", 800.00f, 8);
		b2.show();
	}
}