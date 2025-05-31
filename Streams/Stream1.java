import java.util.function.*;
import java.util.*;
import java.util.stream.*;

class Stream1{
public static void main(String sr[])
{
List<Integer> list=List.of(1,2,3,4,5);
System.out.println(list);


list.stream().forEach(e->System.out.println(e));

Stream<Integer> s=list.stream();
System.out.println(s);

//Array of values
String [] names={"vamsi","leo","musk"};
Stream<String> s2=Arrays.stream(names);
System.out.println(s2);

//Stream Methods
Stream<String> s3=Stream.of("One","two","three");



}
}