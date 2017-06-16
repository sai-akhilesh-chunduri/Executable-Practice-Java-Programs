//Program for the scope of Local Variables
class Localvariable{
      public static void main(java.lang.String args[]){
      int a= 100;
      {
        int b=20;
        System.out.println("Value of a can be acessed from here =" +a);
        System.out.println("You can acess b from here" +b);
      }
  // System.out.println("You can't acess b from here" +b);
   }
}