//Program for Sigma N , with usage of loops
import java.util.Scanner;
class SumofNumbers{
      public static void main(java.lang.String args[]){
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the number upto which you want the sum");
      int n=sc.nextInt();
      int a=0;
      int i;
      for(i=1;i<=n;i++)
       {   
       a=a+i;
       }
     System.out.println("The sum = " +a);
    }
}

/* Sigma n= {n(n+1)}/2
   Sigma (n-1) = (Sigma (n) - n). 
Here we have mase use of the Scanner class which already
there in Java Library. We imported the Scanner class from Util package.Then we created an
object Sc in Scanner class. We have done this to invoke the methods of Scanner class.
nextInt() is a method of Scanner class and its used to an Int type from user at the runtime.
We have stored this in Int variable n."sc.nextInt()" is nothing but invoking the method of
Scanner class using a newly created object sc. */  