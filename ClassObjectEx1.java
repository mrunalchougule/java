/* WAP to create a class Book and show two book details - id, book_name, author, cost */

class Book
{
	int id;
	String book_name;
	String author;
	float cost;
}




class ClassObjectEx1
{
	public static void main(String []args)
	{
		//Object is reference to the instace of a class
		Book b1 = new Book();
		b1.id = 391;
		b1.book_name = "Steve Jobs";
		b1.author = "James Gosling";
		b1.cost = 7000.00f;


		Book b2 = new Book();
		b2.id = 491;
		b2.book_name = "The White Book";
		b2.author = "Peter";
		b2.cost = 1700.00f;

		System.out.println(b1.id + "\t" + b1.book_name + "\t" + b1.author + "\t" + b1.cost);
	}
}



/* Assignment: Create class Product. Store product_name, cost, qty and discount in rupees.
   show 3 products order by their cost in ascending  */


