// WAP to input m and n. Define Function to print even and odd numbers, following function prototype as given below//
   //1. public static int[] filterByEven(int m, int n);
  // 2. public static int[] filterByOdd(int m, int n);



import java.util.Scanner;

class ScannerExample6
{
	public static void main(String []args)
	{
		Scanner s1 = new Scanner(System.in);
		int m;
		int n;

		System.out.print("\n Enter start :");
		m = s1.nextInt();

		System.out.print("\n Enter end :");
		n = s1.nextInt();

		int even[] = filterByEven(m, n);
		System.out.println("Even numbers are:");

		for(int i=0;i<even.length;i++)
		{
			System.out.println(even[i]);
		}
	}

	public static int[] filterByEven(int m, int n)
	{

		int arr[] = new int[5];
		int index=0;

		for(int x=m%2==0?m:m+1;x<=n;x+=2)
		{
			arr[index] = x;
			index++;
		}

		return arr;
	}

}