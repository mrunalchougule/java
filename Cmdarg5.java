//WAP input two character chech sam or not//
// comparing character//



class Cmdarg5
{
      public static void main(String []args)
      {
           int n=args.length;

           if(n==2)
           {
                 char ch1=args[0].charAt(0);
                 char ch2=args[1].charAt(0);

                 if(ch1==ch2)
                 {
                      System.out.println("Strings are same");
                 }
                 else
                 {
                      System.out.println("strings are different");
                 }
            }

           else
           {
                   System.out.println("\n Invalid Number of command line arguments");
           }
      }
 }