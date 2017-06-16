//Program2 for instance variables
class Instancevariableexample2{
      public void somemethod(){
       int b=87;//Local Variable
       System.out.println("The value of a is @ which is being used here before its declared in the progarm is"+ a);              
       System.out.println("The value of b is"+ b);
     }
      int a=848;
       public static void main(java.lang.String args[]){
       Instancevariableexample2 someobject=new Instancevariableexample2();
       someobject.somemethod();
     }
}
       