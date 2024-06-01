//input inches and convrt into yard feet//


import java.util.Scanner;

class Assignment3
{
	public static void main(String []args)
	{
	       int inch,yard,feet;
	       Scanner s1= new Scanner(System.in);
	       System.out.println("Enter inches");
	       inch=s1.nextInt();
	       yard=inch/16;
	       feet=inch/12;
	       System.out.println("yard="+yard);
	       System.out.println("Feets="+feet);
	 }
}

