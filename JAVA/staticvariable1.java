class staticvariable1{
      static int integervariable;
      static float floatvariable;    
      static boolean boolvariable;
  //Above we have declared all the static variables ,but didn't assign any values to them
  public static void main(java.lang.String args[]){
   /*here we need not create any object reference variable or an instance variable to acess the static varaible ,
  just like in the case of Instance varaibles*/

   System.out.println("The default integer value is=" +integervariable);
   System.out.println("The default float value is=" +floatvariable);
   System.out.println("The default boolean value is=" +boolvariable);
  }
}

/*here in the above program static variables are declared and are being utilised within the same class,
  so there's no need to use any access modifiers , but if we want to make use of a static variable or also 
  called as class variable in some external class apart from which it's declared , we need to use public
  access modifier. And aditionally, if we wanna utilise a class variable in some external class we need 
  to refer to it as (classname.variablename) */    