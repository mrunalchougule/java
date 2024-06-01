/* WAP to create class Author. create 3 author objects and compare who author wrote more than
   10 books */

class Author
{
	String fullName;
	int booksCount;

	void create(String name, int count)
	{
		fullName = name;
		booksCount = count;
	}
}

class ClassObjectEx6
{
	public static void main(String []args)
	{
		Author a1 = new Author();
		a1.create("Smith", 13);

		Author a2 = new Author();
		a2.create("Devid", 9);

		Author a3 = new Author();
		a3.create("Mathew", 11);

		if(a1.booksCount>=10)
			System.out.println(a1.fullName);

		if(a2.booksCount>=10)
			System.out.println(a2.fullName);

		if(a3.booksCount>=10)
			System.out.println(a3.fullName);
	}
}