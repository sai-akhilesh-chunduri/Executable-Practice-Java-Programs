//Program to demonstrate that Main method is static and JVM dosen't create an object for the main() method
abstract class jvmCreatesObjectForMainMethodTest{
               public static void main(java.lang.String args[]){
                   System.out.println("I have purposefully used an abstract class here.You cant create an Object in Abstract class ,Gennerally to invoke a method its done by creating an object. But here the main() method gets executed without creation of an object for it , and moreover you cant create an object in Abstract class.This is the meaning of Static methods");
                 }
}