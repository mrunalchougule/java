//wapto create class author create 3author object and compare who wrote more than 10 books//

class Author
{
    String fullName;
    int bookCount;

    void create(String name,int count)
    {
    fullName=name;
    bookCount=count;
    }
}
class ClassObjectEx8
{
   public static void main(String[]args)
   {
     Author a1=new Author();
     a1.create("Smith",13);

     Author a2=new Author();
     a2.create("Devid",9);

     Author a3=new Author();
     a3.create("Mathew",11);

     Author data[]={a1,a2,a3};
     compare(data);
   }
   public static void compare(Author x[])
   {
     for(int i=0;i<x.length;i++)
     {
       if(x[i].booksCount>=10)
       System.out.println(x[i].fullName);
      }
   }
}
