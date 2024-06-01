class Order
{
	int id;
	String date;
}

Order []orders = new Order[3];
orders[0] = new Order();
orders[1] = new Order();
orders[2] = new Order();

for(int i=0;i<orders.length;i++)
{
	orders[i].id = i%2;
	orders[i].date=(i+(i*3)%2)+"-"+10+"202"+(i%2);
}
