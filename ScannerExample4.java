// WAP to input storage capacity in gigabytes and convert it to Megabytes, Kilobytes, Bytes and in bits //

import java.util.Scanner;

class ScannerExample4
{

	public static void main(String []args)
	{
		//scope - local scope
		int gb;

		Scanner s1 = new Scanner(System.in);

		System.out.print("\n Enter Storage Capaciy in gigabytes :");
		gb = s1.nextInt();

		int ansm = convertToMb(gb);			//gb is function-parameter
		System.out.print("\n In Megabytes = "+ ansm);

		int ansk = convertToKb(ansm);
		System.out.print("\n In Kilobytes = "+ ansk);

		int ansb = convertToByte(ansk);
		System.out.print("\n In Bytes = " + ansb);

		long ansbit = convertToBit(ansb);
		System.out.print("\n In Bit = " + ansbit);
	}

	public static int convertToMb(int storage)
	{
		int mb = storage*1024;
		return mb;
	}

	public static int convertToKb(int storage)
	{
		int kb = storage*1024;
		return kb;
	}

	public static int convertToByte(int storage)
	{
		int b = storage*1024;
		return b;
	}

	public static long convertToBit(int storage)
	{
		long bit = (long)storage*8;
		return bit;
	}
}




	//1. Variables declared inside function remains local in scope
	//2. If you not return value from function then return type remains void
	//3. If you are returning value from function then must specify respective return type
	//4. Any function can only retun one value
	//5. Value you pass to function is called function-parameter and function use a variable to
	  // store value is called function-argument


