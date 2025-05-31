import java.util.*;
class LambdaEx{

    public static void main(String arg[]){

        List<String> list=Arrays.asList("Leo","Mark","Valka","Rempo","Doop","Milk","strains");

        // list.stream().
        // forEach(System.out::println);

        // list.forEach(System.out::println);

        // list.forEach(s->System.out.print(s));

        list.forEach(s->{
            if(s.length()>3){
                System.out.println(s);
            }
        });

    }
}