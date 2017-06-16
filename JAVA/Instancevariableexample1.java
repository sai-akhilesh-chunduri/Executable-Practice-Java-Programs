//Program1 for Instance variables
class Instancevariableexample1{

/*These are instance variables. They are declared within a class and outside the
main method(). They need not be initialized to a value,unlike local variables.
Just like variables in C-language these instance variables of Java have got some 
initialized default value, if u dont initialize that will be printed or else if u 
initialize , the initialized value will be printed.Life time of an instance 
variable is as long as the lifetime of the object assosciated with the instance
variable. Instance variables cant be acessed like Local variables.If u want 
to make use of an instance variable in a method() in ur program, u have to 
first create an object inside the method() of the same class in which the 
instance varibales are declared . And then u can acess these instance variables
by (objectname.instancevariablename)...*/

      int instancenumber;
      float instancefloat;
      double instancedouble;
}
//above u have declared instance variables and have give a name to instance variables
class Method{
      public static void main(java.lang.String args[]){
       Instancevariableexample1 object=new Instancevariableexample1();
//above u have created an object
    System.out.println("Default value of int=" + object.instancenumber);
    System.out.println("Default value of float=" + object.instancefloat);
    System.out.println("Default value of double=" + object.instancedouble);
 }
}
  