//Scanner Class //

import java.util.Scanner;

class ScannerExample1
{
	public static void main(String []args)
	{

		Scanner s1 = new Scanner(System.in);


		String fname;
		String emailid;
		byte age;

		System.out.print("\n Enter first name :");
		fname = s1.next();

		System.out.print("\n Enter email id :");
		emailid = s1.next();

		System.out.print("\n Enter age :");
		age = s1.nextByte();

	}
}

