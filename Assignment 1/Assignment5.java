//input price and quantity and calculate bill amount//


import java.util.Scanner;

public class Assignment5
{
	public static void main(String []args)
	{
		int price,qty,bill;

		Scanner s1 = new Scanner(System.in);

		System.out.print("\n Enter Price:");
		price=s1.nextInt();
	        System.out.print("\n Enter quanity :");
	        qty=s1.nextInt();

		bill=price*qty;
		System.out.print("\n Bill = "+bill);

	  }

}