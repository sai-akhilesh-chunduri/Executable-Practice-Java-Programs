//Program to demonstrate that Java program compiles without main() method , but you will get run time error
public class mainMethodTest
{
    static
    {
        System.out.println("program is running without main() method");
    }
}

/* It will give u a run time error , but not compile time error,which means 
 that the proram wont get compiled from main() onwards. main() has got nothing
to do with compiling . Once compiled the program will run from main() onwards*/