



class Product
{
	String title;
	String category;
	float cost;
	int qty;

	public Product()
	{
		title = "Unknown Product";
		category = "Unknown";
		cost = 0.00f;
		qty = 0;
	}

	public Product(String title, String category, float cost, int qty)
	{
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.qty = qty;
	}

	public void show()
	{
		System.out.println(String.format("%20s %15s %10.2f %5d", title, category, cost, qty));
	}
}

class ConstructorEx2
{
	public static void main(String []args)
	{
		Product rec[] = new Product[5];

		rec[0] = new Product("Mouse", "Electronics", 700.00f, 3);
		rec[1] = new Product("Keyboard", "Electronics", 1400.00f, 2);
		rec[2] = new Product("Television", "Electronics", 48000.00f, 4);
		rec[3] = new Product("Rice", "Grossary", 100.00f, 3);
		rec[4] = new Product("Edible Oil", "Grossary", 120.00f, 2);

		for(int i=0;i<rec.length;i++)
		{
			rec[i].show();
		}
	}
}