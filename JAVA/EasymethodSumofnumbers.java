//Program to demonstrate Sigma N without use of loops
import java.util.Scanner;
class EasymethodSumofnumbers{
      public static void main(java.lang.String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number uptill which you wanna find the sum");
      int n=sc.nextInt();
      int a=n*n;
      int b=n;
      int c=a+b;
      int d=c/2;
      System.out.println("The sum is = " +d);
     }
}
         