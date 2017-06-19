import java.util.Scanner;
class cricket{
//Declaring and initializing a static variable here
      static String country ="India";
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the name of the cricketer");
      String name=sc.next();
      Scanner r=new Scanner(System.in);
      System.out.println("Enter the runs he has scored");
      int scoredruns=r.nextInt();
//Declaring and initializing instance variables here
      void display(){
      System.out.println(name + " " + scoredruns + " " + country); 
      }
  }
class cricketmain{
      public static void main(java.lang.String args[]){
       cricket p1=new cricket();
//Here p1 is a local variable for the class cricketmain
       p1.display();
 } 
}
      