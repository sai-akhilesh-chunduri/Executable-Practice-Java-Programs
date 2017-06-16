//Program to know what happens if we use String as classname 
class String{
      public static void main(java.lang.String args[]){
         System.out.println("Here String also a predefined class name and Java allows u to use it  But u should never use it a class name in ur program This is an exception Because  Main thread is looking for main method() with predefined String class array argument But here it got main method() with user defined String class Whenever Main thread will see a class name it tries to search that class scope by scope First it will see in your program then in your package If not found then JVM follows delegation hierarchy principle to load that class Hence you will get run-time error To run above program, we can also provide full path of String class, i.e. java.lang.String ");
   }
}

//you will get a runtime error, not compile time error 
// PSVM(String args[]), if this is the case the program won't run.
//PSVM(java.lang.String args[]), then the program will run