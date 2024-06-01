//calculation of population//

import java.util.Scanner;

public class Assignment4
{
	public static void main(String []args)
	{
		float pop,wpop,menpop,menlil,womenlil,will,mill,lil;

		Scanner s1 = new Scanner(System.in);

		System.out.print("\n Enter Population of town:");
		price=s1.nextFloat();

	        menpop=0.52*pop;
	        wpop=pop-menpop;
	        lil=0.48*pop;
	        mlil=0.35*menpop;
	        wlil=lil-mlil;
	        will=wpop-wlil;
	        mill=mpop-mlil;
		System.out.print("\n Total population = "+pop);
		System.out.print("\n Men population = "+menpop);

		System.out.print("\n women population = "+wpop);
		System.out.print("\n Total litteracy = "+lil);
		System.out.print("\n Men litteracy = "+mlil);
		System.out.print("\n women litteracy = "+wlil);

		System.out.print("\n men illetrcy = "+mill);
		System.out.print("\n women illteracy = "+will);





	  }

}