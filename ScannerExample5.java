// WAP to input storage capacity in gigabytes and convert it to Megabytes, Kilobytes, Bytes  in bits //

import java.util.Scanner;


class ScannerExample5
{
	static int gb;
	static int mb;
	static int kb;
	static int b;
	static long bit;

	public static void main(String []args)
	{

		for(int i=0;i<=2;i++)
		{
			 cnt++;
		}

		Scanner s1 = new Scanner(System.in);

		System.out.print("\n Enter Storage Capaciy in gigabytes :");
		gb = s1.nextInt();

		System.out.print("\n In Megabytes = "+ mb);
		System.out.print("\n In Kilobytes = "+ kb);
		System.out.print("\n In Bytes = " + b);
		System.out.print("\n In Bit = " + bit);

		convertToMb();
		convertToKb();
		convertToByte();
		convertToBit();

	}

	public static void convertToMb(int storage)
	{
		mb = gb*1024;
	}

	public static void convertToKb()
	{
		kb = mb*1024;
	}

	public static void convertToByte()
	{
		b = kb*1024;
	}

	public static void convertToBit()
	{
		bit = (long)b*8;
	}
}







