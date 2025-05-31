class MyFunctinalInterEx {

    // @Override
    // public void greet(){
    //     System.out.println("form greet");
    // }

    public static void main(String ar[]){
        // MyFuncInter obj=new MyFunctinalInterEx();
        // obj.greet(); on way of achiving 

        // MyFuncInter myObj=new MyFuncInter(){
        //      @Override
        //      public void greet(){
        //         System.out.println("From inner class");
        //      }
        // };

        // myObj.greet(); creating inner class to achive functional interface

        // Lambda

        // MyFuncInter myObj=()->System.out.println("from lambda func");
        // myObj.greet();

      MyFuncInter myObj=(a,b)->a+b;

      System.out.println(myObj.sum(34,1));

      MyFuncInter myObj2=(a,b)->{
        return a-b;
      };

      System.out.println(myObj2.sum(23,9));

      Predicate<String> pre=()->pre.accept("23");

    }
}