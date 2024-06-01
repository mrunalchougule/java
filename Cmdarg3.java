//WAP to input two numbers and print numbers between them using while loop//

class Cmdarg3
{
        public static void main(String []args)
        {
              int n=args.length;

              if(n==2)
              {
                    int m=Integer.parseInt(args[0]);
                    int s=Integer.parseInt(args[1]);

                    while(m<=s)
                    {
                       System.out.println("\t" +m);
                       m++;
                    }
               }
               else
               {
                   System.out.println("invalid command");
               }
        }
}
