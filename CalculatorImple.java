import java.util.*;
class CalculatorImple{

    public static void main (String arg[]){

        // Calculator obj=new Calculator(){

        //     @Override
        //     public int operation(int a,int b){
        //         return a+b;
        //     }
        // };

        // System.out.println(obj.operation(23,4));

       Calculator myObj=(a,b)->a+b;
       Calculator myObj2=(a,b)->{return a-b;};
       Calculator multi=(a,b)->{return a*b;};

       System.out.println(myObj.operation(23,4));
       System.out.println(myObj2.operation(38,44));
       System.out.println(multi.operation(89,2));

       Media media=()->System.out.println("playing media");
       media.play();
   
     List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8);
     list.forEach(i->{
        if(i%2==0){
            System.out.println(i);
        }
     });
    
    }
}