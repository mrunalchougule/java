//odd no and even no//


import java.util.Scanner;

class Assignment7
{
	public static void main(String []args)
	{
		Scanner s1 = new Scanner(System.in);
		int m=1;
		int n=100;
		int j=101;
		int k=200;

		int even[] = filterByEven(m, n);	//while passing value dont specify datatype
		int odd[]=filterbyodd(j,k);

		System.out.println("Even numbers betwwn 101to 200 are:");

		for(int i=0;i<even.length;i++)
		{
			System.out.println(even[i]);
		}
		System.out.println("Odd numbers between 201 to 300 are:");

		for(int i=0;i<50;i++)
		{
			System.out.println(odd[i]);
	    }
	}

	public static int[] filterByEven(int m, int n)		//argument must be declare using respective datatype
	{
		//java array declaration syntax
		int s;
		s= n%2==0?(n-m)/2+1:(n-m)/2;
		int arr[] = new int[s];
		int index=0;

		for(int x=m%2==0?m:m+1;x<=n;x+=2)
		{
			arr[index] = x;
			index++;
		}

		return arr;
	}
	public static int[] filterbyodd(int j, int k)
   {//java array declaration syntax
		int d;
		d= 50;
		int array[] = new int[d];
		int index=0;

		for(int x=j%2==1?j:j+1;x<=k;x+=2)
		{
			array[index] = x;
			index++;
		}

		return array;
	}

}