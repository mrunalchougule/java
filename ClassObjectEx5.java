import java.util.Scanner;

class AreaCalculation
{
	public float calculateCircle(float r)
	{
		float areac;
		areac = 3.14f*rad*rad;
		return areac;
	}

	public float calculateTriangle(float base, float height)
	{
		float areat;
		areat = 0.5f*base*height;
		return areat;
	}

	public float calculateSquare(float side)
	{
		float areas;
		areas = side*side;
		return areas;
	}
}

class ClassObjectEx5
{
	public static void main(String []args)
	{
		Scanner scanner = new Scanner(System.in);

		float rad, base, height, side;

		AreaCalculation a1 = new AreaCalculation();

		System.out.print("\n Enter radius :");
		rad = scan.nextFloat();

		float ans1 = a1.calculateCircle(rad);


		System.out.print("\n Enter base :");
		base = scan.nextFloat();

		System.out.print("\n Enter height :");
		height = scan.nextFloat();

		float ans2 = a1.calcualteTriangle(base, height);

		System.out.print("\n Enter side :");
		side = scan.nextFloat();

		float ans3 = a1.calculateSquare(side);

		System.out.println("area of circle = " + ans1);
		System.out.println("area of triangle = " + ans2);
		System.out.println("area of square = " + ans3);

	}
}