class staticvariable2{
      static int integervariable;
      static float floatvariable=12.8f;//On spot initialization of static variable
     //Below we are making use of Static initializer block to initialize the satic variable
     static{
     //Static block
      integervariable=100;
       }
   public static void main(java.lang.String args[]){
    
      System.out.println("The float value which is initialized on spot=" +floatvariable);
      System.out.println("The integer value which is initialized inside a staic block=" +integervariable);
    }
}