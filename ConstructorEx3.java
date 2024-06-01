/* this constructor */


class Area
{
	float rad, base, height, side;

	//1
	public Area()
	{
		this.rad = this.base = this.height = this.side = 1.5f;
	}

	//2
	public Area(float rad, float base, float height)
	{
		this();
		this.rad = rad;
		this.base = base;
		this.height = height;
	}


	//3
	public Area(float rad, float base, float height, float side)
	{
		this(rad, base, height);  //this() constructor
		this.side = side;
	}

	public void calculate()
	{
		System.out.println("Area of circle with rad " + this.rad + " = " + (3.14f*this.rad*this.rad));
		System.out.println("Area of Triangle with base " + this.base + " and height " + this.height + " = " + (0.5f*this.base*this.height));
		System.out.println("Area of Square with side " + this.side + " = " + (this.side*this.side));
	}
}

class ConstructorEx3
{
	public static void main(String []args)
	{

		//default constructor automatically get call when object is initialized
		Area a1 = new Area();
		a1.calculate();

		Area a2 = new Area(4.5f,7.8f,8.3f,10.0f);
		a2.calculate();

		Area a3 = new Area(9.4f,8.6f,1.8f);
		a3.calculate();
	}
}