/* WAP to read loan details and calculate interest amount per year. */

import java.util.Scanner;

class ScannerExample2
{
	public static void main(String []args)
	{
		float loan_amount;
		float rate;
		byte tenure;
		Scanner s1 = new Scanner(System.in);

		System.out.print("\n Enter loan amount :");
		loan_amount = s1.nextFloat();

		System.out.print("\n Enter rate of interest :");
		rate = s1.nextFloat();

		System.out.print("\n Enter Tenure :");
		tenure = s1.nextByte();

		float interest_amount = loan_amount*rate/100;
		System.out.println("Per year interest amount is " + interest_amount);

	}
}

