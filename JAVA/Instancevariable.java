//Program for initializing an instance variable
class Instancevariable{
      float a=10.5f;
      int myvar;
      Instancevariable(){
        myvar=10;
       }
  //above you have made use of constructor
 //In an other way,you can also initialize the instance variable directly on the spot as myvar=10;
 public void test(){
  int b=24;
  System.out.println("The value of local variable b =" +b);
  System.out.println("The value of Instance variable which is initialized on spot=" +a);
  System.out.println("The value of Instance variable myvar which is initialized using constructor =" +myvar);
   }
   public static void main(java.lang.String args[]){
   Instancevariable objectreference=new Instancevariable();
   objectreference.test();
  }
}