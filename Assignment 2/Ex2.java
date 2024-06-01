


 class Ex2
 {
       public static void main(String []args)
       {
          int n=args.length;

          if(n==2)
          {

               int no1=Integer.parseInt(args[0]);
               int no2=Integer.parseInt(args[1]);

               int add=no1+no2;
               int sub=no1-no2;
               int multi=no1*no2;
               int div=no1/no2;
               int rem=no1%no2;

              System.out.println("Addition of two numbers=" +add);
              System.out.println("Substraction of two numbers=" +sub);
              System.out.println("Multiplication of two numbers=" +multi);
              System.out.println("Division of two numbers=" +div);
              System.out.println("Reminder of two numbers=" +rem);
          }
          else
          {
              System.out.println("\n Invalid Number of Arguments");
          }
       }
}