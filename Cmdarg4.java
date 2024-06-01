//WAP to input two string check it is same or different//
//comparing two values//


class Cmdarg4
{
       public static void main(String []args)
       {
               int n=args.length;

               if(n==2)
               {
                      if(args[0].equals(args[1])==true)
                      {
                           System.out.println("Strings are same");
                      }
                      else
                      {
                           System.out.println("Strings are diffrent");
                      }
                }
                else
                {
                      System.out.println("\n Invalid Number of command line arguments");
                 }
        }
}
