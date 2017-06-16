//Progmam to demonstrate that filename need not be same as class name..
class akhilesh
{
   public static void main(java.lang.String[] args){
      System.out.println("Akhilesh class is executed");
   }
}
 
class abhishek
{
   public static void main(java.lang.String[] args){
      System.out.println("abhishek class will be executed");
   }
}
/*
When the above file is compiled as javac classnamefilenamemyth.java will create two .class files as akhilesh.class and abhishek.class .
Since each class has separate main() stub they can be tested individually.
When java akhilesh is executed the output is akhilesh class.
When java abhishek is executed the output is abhishek class.*/
//You can give any filename.java to save the file