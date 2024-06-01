//area and primeter of rectangle//

import java.util.Scanner;

public class Assignment1
{
	public static void main(String []args)
	{
		int w,h,area,perimeter;

		Scanner s1 = new Scanner(System.in);

		System.out.print("\n Enter height :");
		h=s1.nextInt();
	        System.out.print("\n Enter width :");
	        w=s1.nextInt();

		area=w*h;
		perimeter=2*(h+w);
		System.out.print("\n Area of rectangle = "+area);
	    System.out.print("\n perimeter of rectangle" +perimeter);

	  }

}