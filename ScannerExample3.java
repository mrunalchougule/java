/* WAP to input storage capacity in gigabytes and convert it to Megabytes, Kilobytes, Bytes and in bits */

import java.util.Scanner;

class ScannerExample3
{
	public static void main(String []args)
	{
		int gb;
		int mb;
		int kb;
		int b;
		long bit;

		Scanner s1 = new Scanner(System.in);

		System.out.print("\n Enter Storage Capaciy in gigabytes :");
		gb = s1.nextInt();

		mb = gb*1024;
		kb = mb*1024;
		b = kb*1024;
		bit = (long)b*8;

		System.out.print("\n In Megabytes = "+ mb);
		System.out.print("\n In Kilobytes = "+ kb);
		System.out.print("\n In Bytes = " + b);
		System.out.print("\n In Bit = " + bit);

		convertToMb();
		convertToKb();
		convertToByte();
		convertToBit();

	}

	public static void convertToMb()
	{
	}

	public static void convertToKb()
	{
	}

	public static void convertToByte()
	{
	}

	public static void convertToBit()
	{
	}
}

