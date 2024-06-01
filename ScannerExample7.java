// WAP to define function to find min value and max value from array //

class ScannerExample7
{
	public static void main(String []args)
	{
		int a[] = {10,38,48,1,58};

		int max_value = findMax(a);


		System.out.println("Max value = " + max_value);

	}

	public static int findMax(int x[])
	{
		int max =  x[0];
		for(int i=1;i<x.length;i++)
		{
			if(x[i]>max)
			{
				max = x[i];
			}
		}

		return max;
	}
}