/* WAP to create class and demonstrate how to return object of a class from function */

class Student
{
	int rollNo;
	String name;
	float pert;

	public void push(int r, String n, float p)
	{
		rollNo = r;
		name = n;
		pert = p;
	}

	public String toString()
	{
		return rollNo + "\t" + name + "\t" + pert;
	}
}

class ClassObjectEx4
{
	public static void main(String []args)
	{
		Student s1 = new Student();
		s1.push(103, "Smith", 90.41f);

		Student s2 = new Student();
		s2.push(104, "John", 83.53f);

		System.out.println(s1);
		System.out.println(s2);

		boolean ans1 = compare(s1, s2);
		Student ans2 = compareMarks(s1, s2);

		System.out.println(ans1);
		System.out.println(ans2);
	}

	public static boolean compare(Student x, Student y)
	{
		if(x.rollNo == y.rollNo && x.name.equals(y.name))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static Student compareMarks(Student x, Student y)
		{
			if(x.pert>y.pert)
			{
				return x;
			}
			else
			{
				return y;
			}
	}
}