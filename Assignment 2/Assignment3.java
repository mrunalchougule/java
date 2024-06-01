//to show that which digit is max //
//ex 347954 digit=9 //

import java.util.Scanner;
class Assignment3
{
   public static void main(String[]args)
   {
       Scanner scan=new Scanner(System.in);
       int max=Integer.MAX_VALUE;
       System.out.println("Enter number");
       int num=scan.nextInt();
       while(num>0)
       {
       int rem=num%10;
       if(rem>=max);
       max=rem;
       num=num/10;
       }
   System.out.println("The largest digit in th given no is:"+max);
   }
}