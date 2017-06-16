//Program for Sigma Nsquare
import java.util.Scanner;
class SigmaNsquare{
      public static void main(java.lang.String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      int n=sc.nextInt();
      int a=0;
      int i;
      int k=0;
      for(i=1;i<=n;i++)
       {
         k=i*i;
         a=a+k;
       }
     System.out.println("The SigmaNsquare is =" +a);
    }
}
      