/* WAP to define class for the following and solve questions

	Class Name : Product
	Attributes : id, title, cost, category
	Method  : push(), toString()
	Description : push() function will ask user to input respective values for the
		      attribute and toString() function will display product information


	Q1. create 3 products and compare which product is more in cost?
	Q2. increase each product cost by rs.100 and show product information


*/

import java.util.Scanner;

class Product
{
	//object will reserve memory for non-static
	int id;
	String title;
	float cost;
	String category;

	//class will reserve memory only for once among all objects
	static Scanner scan = new Scanner(System.in);

	public void push()
	{
		System.out.print("\n Enter Id :");
		id = scan.nextInt();

		System.out.print("\n Enter Product Name :");
		title = scan.next();

		System.out.print("\n Enter Cost :");
		cost = scan.nextFloat();

		System.out.print("\n Enter Category :");
		category = scan.next();
	}

	public String toString()
	{
		return id + "\t" + title + "\t" + cost + "\t" + category;
	}
}


class ClassObjectEx2
{

	public static void main(String []args)
	{
		/*
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();

		p1.push();
		p2.push();
		p3.push();

		if(p1.cost>p2.cost && p1.cost > p3.cost)
		{
			System.out.println(p1.title + " is more in cost");
		}
		else if(p2.cost > p3.cost)
		{
			System.out.println(p2.title + " is more in cost");
		}
		else
		{
			System.out.println(p3.title + " is more in cost");
		}
		*/

		Product p1 = new Product();
		p1.push();
		System.out.println(p1);
	}
}

/* Assignment: WAP to create class Book. Define function which will read bookName, authorName,
   cost and totalPages. Define another function to show book details.
   Create 3 records of book. check whether all three books are unique or not */
